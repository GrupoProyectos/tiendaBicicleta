package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Esta Clase abre la conexión con la Base de Datos
 * 
 * @author Grupo4
 * 
 * 
 * 
 * @author Chen, Iván, Aitor, Alejandro
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

	String driverUrl = "jdbc:mysql://10.90.36.31:3306/tiendabicis"; // enlace hacia la BBDD

	String user = "grupo4"; // usuario de la BBDD

	String password = "1234"; // contraseña del usuario

	/**
	 * Método de conexión
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
			System.out.println("Código del Error: " + se.getErrorCode());
		} catch (Exception se) {
			System.out.println("Otro problema: " + se);
		}

	}

	public Connection getConnection() {
		return con;
	}

	/**
	 * Metodo para desconectar de BBDD y cerrar las conexiones que ha establecido
	 * anteriormente del metodo conexion()
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

}
