package modelo;

/**
 * 
 * @author Grupo 4
 * 
 * @version 1.0
 * 
 * 
 */
public class Bicicleta {

	private int idBicicleta;
	private String categoria;
	private String marca;
	private String modelo;
	private String talla;
	private double precio;

	public Bicicleta() {

	}

	/**
	 * @param idBicicleta.
	 *            Index de la tabla bicicleta.
	 * @param Categoria.
	 *            Categoría a la que pertenece la bicicicleta, enum
	 *            "montaña","carretera"
	 * @param marca.
	 *            String que indica la marca de la bicicleta.
	 * @param modelo.
	 *            String que indica el modelo de la bicicleta.
	 * @param talla.
	 *            Enum para indicar la talla de la bici entre X, M y L
	 * @param precio.
	 *            Precio de la bicicleta.
	 */
	/*
	 * public Bicicleta(int idBicicleta, Categoria categoria, String marca, String
	 * modelo, Talla talla, double precio) { super(); this.idBicicleta =
	 * idBicicleta; this.categoria = categoria; this.marca = marca; this.modelo =
	 * modelo; this.talla = talla; this.precio = precio; }
	 */
	public Bicicleta(String categoria, String marca, String modelo, String talla, double precio) {
		super();
		this.categoria = categoria;
		this.marca = marca;
		this.modelo = modelo;
		this.talla = talla;
		this.precio = precio;
	}

	// Setters & Getters

	public int getIdBicicleta() {
		return idBicicleta;
	}

	public void setIdBicicleta(int idBicicleta) {
		this.idBicicleta = idBicicleta;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
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

	public String getTalla() {
		return talla;
	}

	public void setTalla(String talla) {
		this.talla = talla;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Bicicleta [idBicicleta=");
		builder.append(idBicicleta);
		builder.append(", categoria=");
		builder.append(categoria);
		builder.append(", marca=");
		builder.append(marca);
		builder.append(", modelo=");
		builder.append(modelo);
		builder.append(", talla=");
		builder.append(talla);
		builder.append(", precio=");
		builder.append(precio);
		builder.append("]");
		return builder.toString();
	}

}
