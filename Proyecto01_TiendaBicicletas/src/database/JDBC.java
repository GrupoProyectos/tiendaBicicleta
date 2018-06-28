package database;

import java.sql.*;
import javax.sql.*;

/** Esta Clase abre la conexi�n con la Base de Datos
 * @author Chen, Iv�n, Aitor, Alejandro
 * @version 1.0
 */

public class JDBC {
	
	/** Atributos de la Clase
	 */
	
	static Connection con;
	static Statement st;
	static ResultSet rs;
	
	/**Constructor vac�o
	*/
	public JDBC() {

	}
	/**
	 * M�todo para establecer la conexi�n con la Base de Datos
	 * @throws SQLException
	 */
	public void conexion() throws SQLException {
		try {
			String driverClassName = "com.mysql.jdbc.Driver"; // comprobamos la  existencia del driver JDBC 
			Class.forName(driverClassName); 

			String driverUrl = "jdbc:mysql://10.90.36.31/tiendabicis"; // enlace hacia la BBDD

			String user = "root"; // usuario de la BBDD
			String password = "1111"; // contrase�a del usuario

			con = DriverManager.getConnection(driverUrl, user, password); // generamos la conexion
			
		} catch (ClassNotFoundException e) { // Excepci�n del driver
			System.out.println("No se encuentra el driver");
		}  catch (SQLException e) { System.out.println("Excepcion SQL: " +
			  e.getMessage()); System.out.println("Estado SQL: " +
			  e.getSQLState()); System.out.println("C�digo del Error: " +
			  e.getErrorCode()); }
			 
	}
	
	public void peticionCatalogo() throws SQLException {
		st = con.createStatement(); // creamos un objeto de la Clase Statement

		String query = "SELECT * FROM bicicleta"; // lanzamos la petici�n
		rs = st.executeQuery(query); //
	}

}
