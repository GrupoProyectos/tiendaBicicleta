package control;

import datos.IDatosBici;
import datos.implementado.DatosBiciImp;
import modelo.Bicicleta;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JDBC jdbc = new JDBC();
		
		jdbc.conexion();
		
		System.out.println(jdbc.a�adirBicicleta());
		
		jdbc.desconexion();
	}

}
