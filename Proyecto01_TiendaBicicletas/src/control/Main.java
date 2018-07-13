package control;

import java.sql.SQLException;

import database.JDBC;

public class Main {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		JDBC jdbc = new JDBC();
		
		jdbc.getConnection();
		
		System.out.println(jdbc.anadirBicicleta());
		
		jdbc.desconexion();
	}

}
