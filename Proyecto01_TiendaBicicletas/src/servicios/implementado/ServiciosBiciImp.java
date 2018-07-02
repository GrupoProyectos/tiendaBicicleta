package servicios.implementado;

import java.util.List;

import modelo.Bicicleta;
import servicios.IServiciosBici;
import datos.IDatosBici;
import datos.implementado.DatosBiciImp;

public class ServiciosBiciImp implements IServiciosBici {

	private IDatosBici idatosbici = new DatosBiciImp();

	public List<Bicicleta> mostrarCatalogo(String catalogo){
		
		return idatosbici.mostrarCatalogo();
	}

	@Override
	public Bicicleta mostrarBicicleta(int idBicicleta) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
