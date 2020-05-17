package Control;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.AsesoriaDao;
import Dao.ServicioDao;
import Dto.AsesoriaTi;
import Dto.Cliente;
import Dto.Empleado;
import Dto.Persona;
import Dto.Servicio;

/**
 * Servlet implementation class ServicioControl
 */
@WebServlet("/ServicioControl")
public class ServicioControl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServicioControl() {
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
			ServicioDao sD = new ServicioDao();
			AsesoriaTi a =new AsesoriaTi();
			AsesoriaDao aD = new AsesoriaDao();
			Persona p = new Persona();
			Servicio s =new Servicio();
			Cliente c = new Cliente();
			Empleado e = new Empleado();
			String nombre = request.getParameter("nombre");
			float precio = Float.parseFloat( request.getParameter("precio"));
			String empleado = request.getParameter("empleado");
			String cliente = request.getParameter("cliente");
			String descripcion = request.getParameter("descripcion");
			p.setCedula(empleado);
			c.setNit(cliente);
			e.setPersona(p);
			s.setNombre(nombre);
			s.setPrecio(precio);
			s.setCliente(c);
			s.setEmpleado(e);
			sD.registrar(s);
			a.setServicio(s);
			a.setDescripcion(descripcion);
			aD.registrar(a);
			String site = new String("http://localhost:8080/ConsultoriaZ/WebApp/regServicio.jsp");
			response.setStatus(response.SC_MOVED_TEMPORARILY);
			response.setHeader("Location", site);
			
			break;

		case "eliminar":
			int id = Integer.parseInt(request.getParameter("id"));
			ServicioDao sD1  = new ServicioDao();
			AsesoriaDao aT = new AsesoriaDao();
			aT.eliminar(id);
			sD1.eliminar(id);
			String site1 = new String("http://localhost:8080/ConsultoriaZ/WebApp/listarServicio.jsp");
			response.setStatus(response.SC_MOVED_TEMPORARILY);
			response.setHeader("Location", site1);			
			break;
			
			
		case "listar":
			ServicioDao AD = new ServicioDao();
			String site2 = new String("http://localhost:8080/ConsultoriaZ/WebApp/listarServicio.jsp");
			response.setStatus(response.SC_MOVED_TEMPORARILY);
			response.setHeader("Location", site2);
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
