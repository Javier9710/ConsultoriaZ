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
	Persona p = new Persona();
	Persona p1 = new Persona();
	PersonaDao pD = new PersonaDao();
	Empleado e = new Empleado();
	EmpleadoDao eD= new EmpleadoDao();
	Cargo c =new Cargo();
	
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
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String accion = request.getParameter("accion");
		switch (accion) {
		case "registrar":
			//atributos Persona
			String cedula = request.getParameter("cedula");
			String nombre = request.getParameter("nombre");
			int edad = Integer.parseInt(request.getParameter("edad")); 
			String telefono = request.getParameter("telefono");
			String foto = request.getParameter("foto");
			//atributos Empleado
			String pass = request.getParameter("pass");
			int cargo = Integer.parseInt(request.getParameter("cargo"));
			//set
			c.setId(cargo);
			p.setCedula(cedula);
			p.setNombre(nombre);
			p.setEdad(edad);
			p.setTelefono(telefono);
			p.setFoto(foto);
			pD.registrar(p);
			e.setPass(pass);
			e.setCargo(c);
			e.setPersona(p1);
			p1.setId(p.getId());
			eD.registrar(e);
			request.getRequestDispatcher("regEmpleado.jsp").forward(request, response);
			break;
			

		case "editar":

			break;

		case "eliminar":
			int id = Integer.parseInt(request.getParameter("id"));
			eD.eliminar(id);
			pD.eliminar(id);
			request.getRequestDispatcher("listarEmpleado.jsp").forward(request, response);
			break;
			
		case "listar":
			PersonaDao mD = new PersonaDao();
			request.getRequestDispatcher("mensaje.jsp").forward(request, response);
			
			
			break;

		default:
			break;
		}
	}

}
