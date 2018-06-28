package modelo;

public class Bicicleta {
	
	private int idBicicleta;
	private Categoria categoria;
	private String marca;
	private String modelo;
	private Talla talla;
	private double precio;
	
	public Bicicleta(){
		
	}
	
	public void Bicicleta(int idBicicleta, Categoria categoria, String marca, String modelo, Talla tamano, double precio){
		this.idBicicleta = idBicicleta;
		this.categoria = categoria;
		this.marca = marca;
		this.modelo = modelo;
		this.talla = talla;
		this.precio = precio;
	}
	public int getIdBicicleta(){
		return idBicicleta;
	}
	public void setIdBicicleta(int idBicicleta){
		this.idBicicleta = idBicicleta;
	}
	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Talla getTalla() {
		return talla;
	}

	public void setTalla(Talla tamano) {
		this.talla = tamano;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Bicicleta:"
				+ "\n\t categoria -> " + categoria 
				+ "\n\t marca -> " + marca 
				+ "\n\t modelo -> " + modelo 
				+ "\n\t talla -> " + talla
				+ "\n\t precio -> " + precio;
	}
	
}
