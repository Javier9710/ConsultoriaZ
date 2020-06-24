package Control;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Dao.ClienteDao;
import Dao.PersonaDao;
import Dto.Cliente;
import Dto.Persona;

/**
 * Servlet implementation class ClienteControl
 */
@WebServlet("/ClienteControl")
public class ClienteControl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClienteControl() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String accion = request.getParameter("accion");
		switch (accion) {
		case "registro":
			String nit= request.getParameter("nit");
			String nombre= request.getParameter("nombre");
			String direccion= request.getParameter("direccion");
			String contacto= request.getParameter("contacto");
			Cliente c = new Cliente();
			ClienteDao cD = new ClienteDao();
			c.setNit(nit);
			c.setNombre(nombre);
			c.setDireccion(direccion);
			c.setContacto(contacto);
			cD.registrar(c);
			response.sendRedirect("WebApp/regCliente.jsp");

			break;

		case "listar":
			ClienteDao cD1 = new ClienteDao();
			response.sendRedirect("WebApp/listarCliente.jsp");

			break;
			
		case "eliminar": 
			String id = request.getParameter("id");
			ClienteDao cD2 = new ClienteDao();
			cD2.eliminar(id);
			response.sendRedirect("WebApp/listarCliente.jsp");
			break;
			

				
		}
		
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
