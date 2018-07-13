package datos.implementado;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import database.*;
import datos.IDatosBici;
import modelo.Bicicleta;
import modelo.Categoria;
import modelo.Talla;
import utilities.Read;
import database.JDBC;

public class DatosBiciImp implements IDatosBici {

	/**
	 * M�todo para recuperar el cat�logo de la base de datos
	 * 
	 * @ @return catalogo
	 */
	@Override
	public ArrayList<Bicicleta> mostrarCatalogo() {

		ArrayList<Bicicleta> catalogo = new ArrayList<Bicicleta>();

		Statement st = null;
		ResultSet rs = null;

		try {
			JDBC con = new JDBC();
			st = con.getConnection().createStatement();
			rs = st.executeQuery("SELECT * FROM bicicleta");

			while (rs.next()) {

				Bicicleta bici = new Bicicleta();
				bici.setIdBicicleta(rs.getInt("idBicicleta"));
				bici.setCategoria(rs.getString("categoria"));
				bici.setMarca(rs.getString("marca"));
				bici.setModelo(rs.getString("modelo"));
				bici.setTalla(rs.getString("talla"));
				bici.setPrecio(rs.getDouble("precio"));
				catalogo.add(bici);

			}

			con.desconexion();

		} catch (SQLException e) {

			e.printStackTrace();
		}

		return catalogo;

	}

	/**
	 * Metodo para recoger la informacion de una bicicleta a la BBDD para
	 * mostrarla mas tarde en una pagina informativa.
	 * 
	 */

	public Bicicleta mostrarBicicleta(int id) {

		Statement st = null;
		ResultSet rs;

		Bicicleta b = new Bicicleta();
		try {
			
			JDBC con = new JDBC();
			st = con.getConnection().createStatement();
			rs = st.executeQuery("SELECT * from bicicleta where idBicicleta = " + id + ";");
			while(rs.next()){
				b.setIdBicicleta(rs.getInt("idBicicleta"));
				b.setCategoria(rs.getString("categoria"));
				b.setMarca(rs.getString("marca"));
				b.setModelo(rs.getString("modelo"));
				b.setTalla(rs.getString("talla"));
				b.setPrecio(rs.getDouble("precio"));
			}
			
			con.getConnection().close();

		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return b;

		/*
		 * public Bicicleta mostrarBicicleta() { //Bicicleta bici = new
		 * Bicicleta; // falta conexi�n a bbdd y pedir la informaci�n return
		 * bici; }
		 */

	}
}
