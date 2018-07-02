package servicios.implementado;

import java.util.List;

import modelo.Bicicleta;
import servicios.IServiciosBici;
import datos.IDatosBici;
import datos.implementado.DatosBiciImp;

public class ServiciosBiciImp implements IServiciosBici {

	private IDatosBici idatosbici = new DatosBiciImp();

	public List<Bicicleta> mostrarCatalogo() {

		return idatosbici.mostrarCatalogo();
	}

	public Bicicleta mostrarBicicleta(int idBicicleta) {

		return idatosbici.mostrarBicicleta(idBicicleta);
	}

}
