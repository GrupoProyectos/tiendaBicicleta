package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import modelo.Bicicleta;

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
	 * Método para establecer la conexión con la Base de Datos
	 * 
	 * @throws SQLException
	 */
	public void conexion() throws SQLException {
		try {
			// STEP 2: Register JDBC driver
			Class.forName(driverClassName);

			// STEP 3: Open a connection

			this.con = DriverManager.getConnection(this.driverUrl, this.user, this.password);

			// STEP 4: Execute a query

			this.st = this.con.createStatement();

		} catch (SQLException se) {
			// Handle errors for JDBC
			se.printStackTrace();

		} catch (Exception se) {
			// Handle errors for Class.forName
			se.printStackTrace();
		}
	}
	
	/**
	 * Otro método de conexión
	 * 
	 * @throws SQLException
	 */
	public JDBC() {
		try {
			Class.forName(driverClassName);
			con = DriverManager.getConnection(driverUrl, user, password);
		} catch(ClassNotFoundException se){
			System.out.println("No se encuentra el driver");
		} catch(SQLException se) {
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
	 * Método para pedir el Catálogo a la Base de Datos
	 * 
	 * @throws SQLException
	 */

	public List<Bicicleta> peticionCatalogo() throws SQLException {

		String query = "SELECT * FROM bicicleta"; // lanzamos la petición

		ResultSet rs = this.st.executeQuery(query);

		// ResultSetMetaData rsMetaData = rs.getMetaData();

		List<Bicicleta> bicis = new ArrayList<Bicicleta>();

		while (rs.next()) { // Retrieve by column name
			Bicicleta b = new Bicicleta();

			int id = rs.getInt("idBicicleta");
			String categoria = rs.getString("categoria");
			String marca = rs.getString("marca");
			String modelo = rs.getString("modelo");
			String talla = rs.getString("talla");
			int precio = rs.getInt("precio");

			b.setIdBicicleta(id);
			b.setCategoria(categoria);
			b.setMarca(marca);
			b.setModelo(modelo);
			b.setTalla(talla);
			b.setPrecio(precio);

			bicis.add(b);
			/*
			 * new Show().print("-> Register"); // Display values new Show().print("id",
			 * id); new Show().print("categoria", categoria); new Show().print("marca", "" +
			 * marca); new Show().print("modelo", "" + modelo); new Show().print("talla", ""
			 * + talla); new Show().print("precio", "" + precio);
			 */

		}
		return bicis;

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
