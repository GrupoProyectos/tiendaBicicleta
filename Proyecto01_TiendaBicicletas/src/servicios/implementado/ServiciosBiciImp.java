package servicios.implementado;

import java.util.List;

import modelo.Bicicleta;
import servicios.IServiciosBici;
import datos.IDatosBici;
import datos.implementado.DatosBiciImp;

public class ServiciosBiciImp implements IServiciosBici {

	private IDatosBici DatosBiciImp = new DatosBiciImp();

	public List<Bicicleta> mostrarCatalogo(String catalogo){
		
		return DatosBiciImp.mostrarCatalogo(catalogo);
	}

}
