package database;

import java.sql.*;
import javax.sql.*;

/** Esta Clase abre la conexión con la Base de Datos
 * @author Chen, Iván, Aitor, Alejandro
 * @version 1.0
 */

public class JDBC {
	
	/** Atributos de la Clase
	 */
	
	static Connection con;
	static Statement st;
	static ResultSet rs;
	
	/**Constructor vacío
	*/
	public JDBC() {

	}
	/**
	 * Método para establecer la conexión con la Base de Datos
	 * @throws SQLException
	 */
	public void conexion() throws SQLException {
		try {
			String driverClassName = "com.mysql.jdbc.Driver"; // comprobamos la  existencia del driver JDBC 
			Class.forName(driverClassName); 

			String driverUrl = "jdbc:mysql://10.90.36.31/tiendabicis"; // enlace hacia la BBDD

			String user = "root"; // usuario de la BBDD
			String password = "1111"; // contraseña del usuario

			con = DriverManager.getConnection(driverUrl, user, password); // generamos la conexion
			
		} catch (ClassNotFoundException e) { // Excepción del driver
			System.out.println("No se encuentra el driver");
		}  catch (SQLException e) { System.out.println("Excepcion SQL: " +
			  e.getMessage()); System.out.println("Estado SQL: " +
			  e.getSQLState()); System.out.println("Código del Error: " +
			  e.getErrorCode()); }
			 
	}
	
	public void peticionCatalogo() throws SQLException {
		st = con.createStatement(); // creamos un objeto de la Clase Statement

		String query = "SELECT * FROM bicicleta"; // lanzamos la petición
		rs = st.executeQuery(query); //
	}

}
