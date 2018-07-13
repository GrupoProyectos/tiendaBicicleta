package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import modelo.Categoria;
import modelo.Talla;
import utilities.Read;
import utilities.Show;

/**
 * Esta Clase abre la conexi�n con la Base de Datos
 * 
 * @author Grupo4
 * 
 * 
 * 
 * @author Chen, Iv�n, Aitor, Alejandro
 * 
 * @version 1.0
 */

public class JDBC {

	/**
	 * Atributos de la Clase
	 */

	Connection con = null;

	Statement st = null;

	String driverClassName = "com.mysql.jdbc.Driver";

	String driverUrl = "jdbc:mysql://10.90.36.31:3306/tiendabicis"; // enlace
																	// hacia la
																	// BBDD

	String user = "grupo4"; // usuario de la BBDD

	String password = "1234"; // contrase�a del usuario

	/**
	 * M�todo de conexi�n
	 * 
	 * @throws SQLException
	 */
	public JDBC() {
		try {
			Class.forName(driverClassName);
			con = DriverManager.getConnection(driverUrl, user, password);
		} catch (ClassNotFoundException se) {
			System.out.println("No se encuentra el driver");
		} catch (SQLException se) {
			System.out.println("Excepcion SQL: " + se.getMessage());
			System.out.println("Estado SQL: " + se.getSQLState());
			System.out.println("C�digo del Error: " + se.getErrorCode());
		} catch (Exception se) {
			System.out.println("Otro problema: " + se);
		}

	}

	public Connection getConnection() {
		return con;
	}

	/**
	 * Metodo para desconectar de BBDD y cerrar las conexiones que ha
	 * establecido anteriormente del metodo conexion()
	 */
	public void desconexion() {

		try {
			if (this.st != null)
				this.st.close();
		} catch (SQLException se2) {
			se2.printStackTrace();
		}

		try {
			if (this.con != null)
				this.con.close();
		} catch (SQLException se3) {
			se3.printStackTrace();
		}
	}

	public int a�adirBicicleta() throws SQLException {

		String query = "INSERT INTO bicicleta (categoria, marca, modelo, talla, precio) values ('"
				+ new Read().text("Categor�a") + "','" + new Read().text("Marca") + "','" + new Read().text("Modelo")
				+ "','" + new Read().text("Talla") + "'," + new Read().text("Precio") + ")";
		
		int rs = st.executeUpdate(query);
		return rs;

	}

}
