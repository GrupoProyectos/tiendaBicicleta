package datos.implementado;

import java.util.ArrayList;
import java.util.List;

import datos.IDatosBici;
import modelo.Bicicleta;

public class DatosBiciImp implements IDatosBici {

	public List<Bicicleta> mostrarCatalogo() {

		List<Bicicleta> catalogo = new ArrayList<>();
		// falta conexi�n a bbdd y pedir la informaci�n
		return catalogo;
	}
	
	public Bicicleta mostrarBicicleta() {
		Bicicleta bici = new Bicicleta;
		// falta conexi�n a bbdd y pedir la informaci�n
		return bici;
	}

}
