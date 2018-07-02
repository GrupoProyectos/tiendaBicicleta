package control;

import datos.IDatosBici;
import datos.implementado.DatosBiciImp;
import modelo.Bicicleta;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IDatosBici idatosBici= new DatosBiciImp();
		Bicicleta b = idatosBici.mostrarBicicleta(1);
		System.out.println(b);
	}

}
