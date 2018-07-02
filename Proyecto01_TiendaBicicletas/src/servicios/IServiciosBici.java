package servicios;

import java.util.List;

import modelo.Bicicleta;

public interface IServiciosBici { 
	
	public List<Bicicleta> mostrarCatalogo();
	public Bicicleta mostrarBicicleta(int idBicicleta);
	
	/*
	 * Y AQUÍ FALTAN LAS BÚSQUEDAS Y EL BACKOFFICE BÁSICO. HAZ COMO SI ABAJO NO HUBIERA NADA ESCRITO.	 
	 *	
	 *	public List<Bicicleta> buscarCategoria(Bicicleta bici);
	 *	public List<Bicicleta> buscarPrecio(Bicicleta bici);
	 */
	
	
	
}
