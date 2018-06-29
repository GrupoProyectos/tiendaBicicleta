package database;

import java.sql.*;
import javax.sql.*;

import utilities.Show;

/**
 * Esta Clase abre la conexión con la Base de Datos
 * 
 * @author Grupo4
 * 
 *         /** Esta Clase abre la conexión con la Base de Datos
 * 
 * @author Chen, Iván, Aitor, Alejandro
 * 
 * @version 1.0
 */

public class JDBC {

	/**
	 * Atributos de la Clase
	 */

	private Connection con;

	private Statement st;

	String driverClassName = "com.mysql.jdbc.Driver";

	String driverUrl = "jdbc:mysql://10.90.36.31:3306/tiendabicis"; // enlace hacia la BBDD

	String user = "grupo4"; // usuario de la BBDD

	String password = "1234"; // contraseña del usuario

	/**
	 * Constructor vacío
	 */
	public JDBC() {

	}

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

		} catch (Exception e) {
			// Handle errors for Class.forName
			e.printStackTrace();
		}
	}

	/**
	 * Método para pedir el Catálogo a la Base de Datos
	 * 
	 * @throws SQLException
	 */

	public void peticionCatalogo() throws SQLException {

		String query = "SELECT * FROM bicicleta"; // lanzamos la petición

		ResultSet rs = this.st.executeQuery(query);

		while (rs.next()) { // Retrieve by column name
			int id = rs.getInt("idBicicleta");
			String categoria = rs.getString("categoria");
			String marca = rs.getString("marca");
			String modelo = rs.getString("modelo");
			String talla = rs.getString("talla");
			int precio = rs.getInt("precio");

			new Show().print("-> Register"); // Display values
			new Show().print("id", id);
			new Show().print("categoria", categoria);
			new Show().print("marca", "" + marca);
			new Show().print("modelo", "" + modelo);
			new Show().print("talla", "" + talla);
			new Show().print("precio", "" + precio);

		}

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
