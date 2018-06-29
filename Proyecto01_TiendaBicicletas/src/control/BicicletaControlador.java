package control;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import database.JDBC;
import modelo.Bicicleta;

@WebServlet(name = "SelectBici", urlPatterns = { "/SelectBici" }, asyncSupported = false)
public class BicicletaControlador extends HttpServlet {

	/**
	 * Método para recibir los distintos peticiones (como sacar catalogo, agregar
	 * nuevo bicicleta, etc) que ha enviado desde Bicicleta.html y desde este
	 * servlet redireccionar a los apartados de la web que corresponde
	 */
	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// PASO 01: Recoger informacion
		String peticion = request.getParameter("peticion");
		// BeerExpert be = new BeerExpert();

		// PASO 02: Recopilar la respuesta
		// List<Cerveza> result = be.getBrands(c);
		// request.setAttribute("styles", result);

		switch (peticion) {

		case "getCatalogo":

			try {
				JDBC jdbc = new JDBC();
				jdbc.conexion();
				List<Bicicleta> bicis = jdbc.peticionCatalogo();

				request.setAttribute("catalogo", bicis);
				System.out.println(request.getAttribute("catalogo"));
				jdbc.desconexion();

				RequestDispatcher view = request.getRequestDispatcher("Catalogo.jsp");
				view.forward(request, response);
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			break;

		}
		// PASO 03: Salir
		// RequestDispatcher view = request.getRequestDispatcher("result.jsp");
		// view.forward(request, response);
		// request.getRequestDispatcher("result.jsp").forward(request,
		// response);

	}

	/**
	 * Handles the HTTP <code>GET</code> method.
	 * 
	 * @param request
	 *            servlet request
	 * @param response
	 *            servlet response
	 * @throws ServletException
	 *             if a servlet-specific error occurs
	 * @throws IOException
	 *             if an I/O error occurs
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		processRequest(request, response);
	}

	/**
	 * Handles the HTTP <code>POST</code> method.
	 * 
	 * @param request
	 *            servlet request
	 * @param response
	 *            servlet response
	 * @throws ServletException
	 *             if a servlet-specific error occurs
	 * @throws IOException
	 *             if an I/O error occurs
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		processRequest(request, response);
	}

	/**
	 * Returns a short description of the servlet.
	 * 
	 * @return a String containing servlet description
	 */
	@Override
	public String getServletInfo() {
		return "Short description";
	}
}
