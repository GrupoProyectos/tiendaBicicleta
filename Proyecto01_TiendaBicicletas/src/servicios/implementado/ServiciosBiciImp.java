package servicios;

import java.util.List;

import modelo.Bicicleta;
import datos.IDatosBici;
import datos.DatosBiciImp;

public class ServiciosBiciImp implements IServiciosBici {

	private IDatosBici DatosBiciImp = new DatosBiciImp();

	public List<Bicicleta> mostrarCatalogo(String catalogo){
		
		return DatosBiciImp.mostrarCatalogo(catalogo);
	}

}
