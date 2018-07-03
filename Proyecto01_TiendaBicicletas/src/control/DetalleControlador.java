package control;

import servicios.IServiciosBici;
import servicios.implementado.ServiciosBiciImp;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Bicicleta;

@WebServlet(name = "getBici", urlPatterns = { "/getBici" }, asyncSupported = false)
public class DetalleControlador extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private IServiciosBici biciService = new ServiciosBiciImp();

	/**
	 * M�todo para recibir los distintos peticiones (como sacar catalogo, agregar
	 * nuevo bicicleta, etc) que ha enviado desde Bicicleta.html y desde este
	 * servlet redireccionar a los apartados de la web que corresponde
	 */
	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Map<String, String[]> map = request.getParameterMap();

		Set<String> elem = map.keySet();

		String id = elem.toString();

		id = id.substring(3, 4);

		Bicicleta bicicleta = biciService.mostrarBicicleta(Integer.parseInt(id));

		request.setAttribute("bicicleta", bicicleta);

		RequestDispatcher view = request.getRequestDispatcher("Detalle.jsp");
		view.forward(request, response);

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
