package servicios;

import java.util.List;

import modelo.Bicicleta;

public interface IServiciosBici { 
	
	public List<Bicicleta> mostrarCatalogo();
	public Bicicleta mostrarBicicleta(int idBicicleta);
	
	/*
	 * Y AQU� FALTAN LAS B�SQUEDAS Y EL BACKOFFICE B�SICO. HAZ COMO SI ABAJO NO HUBIERA NADA ESCRITO.	 
	 *	
	 *	public List<Bicicleta> buscarCategoria(Bicicleta bici);
	 *	public List<Bicicleta> buscarPrecio(Bicicleta bici);
	 */
	
	
	
}
