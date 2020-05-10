package Control;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.ClienteDao;
import Dto.Cliente;

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
			String site = new String("http://localhost:8080/ConsultoriaZ/WebApp/regCliente.jsp");
			response.setStatus(response.SC_MOVED_TEMPORARILY);
			response.setHeader("Location", site);
			break;

		case "listar":
			ClienteDao cD1 = new ClienteDao();
			String site1 = new String("http://localhost:8080/ConsultoriaZ/WebApp/listarCliente.jsp");
			response.setStatus(response.SC_MOVED_TEMPORARILY);
			response.setHeader("Location", site1);
			break;
			
		case "eliminar": 
			String id = request.getParameter("id");
			ClienteDao cD2 = new ClienteDao();
			cD2.eliminar(id);
			String site2 = new String("http://localhost:8080/ConsultoriaZ/WebApp/listarCliente.jsp");
			response.setStatus(response.SC_MOVED_TEMPORARILY);
			response.setHeader("Location", site2);
			
			
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
