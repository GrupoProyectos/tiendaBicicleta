package servicios;

import java.util.List;

import modelo.Bicicleta;

public interface IServiciosBici {

	public List<Bicicleta> mostrarCatalogo();

	public Bicicleta mostrarBicicleta(int idBicicleta);

}
