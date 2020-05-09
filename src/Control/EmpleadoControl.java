package Control;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.EmpleadoDao;
import Dao.PersonaDao;
import Dto.Cargo;
import Dto.Empleado;
import Dto.Persona;

/**
 * Servlet implementation class EmpleadoControl
 */
@WebServlet("/EmpleadoControl")
public class EmpleadoControl extends HttpServlet {
	Persona p1 = new Persona();
	PersonaDao pD = new PersonaDao();
	PersonaDao pD1 = new PersonaDao();
	Empleado e = new Empleado();
	EmpleadoDao eD1= new EmpleadoDao();
	
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EmpleadoControl() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String accion = request.getParameter("accion");
		switch (accion) {
		case "registro":
			//creo instancias
			Persona p = new Persona();
			Cargo c =new Cargo();
			PersonaDao pD2 = new PersonaDao();
			Empleado e = new Empleado();
			EmpleadoDao eD= new EmpleadoDao();
			
			//atributos Persona
			String cedula = request.getParameter("cedula");
			String nombre = request.getParameter("nombre");
			int edad = Integer.parseInt(request.getParameter("edad")); 
			String telefono = request.getParameter("telefono");
			String foto = request.getParameter("foto");
			//atributos Empleado
			String pass = request.getParameter("pass");
			int cargo = Integer.parseInt(request.getParameter("cargo"));
			
			c.setId(cargo);
			p.setCedula(cedula);
			p.setNombre(nombre);
			p.setEdad(edad);
			p.setTelefono(telefono);
			p.setFoto(foto);
			pD2.registrar(p);
			e.setPass(pass);
			e.setCargo(c);
			e.setPersona(p);
			eD.registrar(e);
			String site = new String("http://localhost:8080/ConsultoriaZ/WebApp/regEmpleado.jsp");
			response.setStatus(response.SC_MOVED_TEMPORARILY);
			response.setHeader("Location", site);
			break;
			
        case "listar":
        	
        	PersonaDao pD = new PersonaDao();
			String site1 = new String("http://localhost:8080/ConsultoriaZ/WebApp/listarEmpleado.jsp");
			response.setStatus(response.SC_MOVED_TEMPORARILY);
			response.setHeader("Location", site1);
			
			break;

        case "eliminar":
        	
			String id = request.getParameter("id");
			eD1.eliminar(id);
			pD1.eliminar(id);
			String site2 = new String("http://localhost:8080/ConsultoriaZ/WebApp/listarEmpleado.jsp");
			response.setStatus(response.SC_MOVED_TEMPORARILY);
			response.setHeader("Location", site2);
		default:
			break;
		}
		
	
			
		}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub


	}
}
