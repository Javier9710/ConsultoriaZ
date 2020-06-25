package Control;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Dao.PersonaDao;
import Dto.Persona;

/**
 * Servlet implementation class AccesoControl
 */
@WebServlet("/AccesoControl")
public class AccesoControl extends HttpServlet {
	
	PersonaDao pD = new PersonaDao();
	Persona p = new Persona();
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AccesoControl() {
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
		case "ingreso1":
			String cedula = request.getParameter("cedula");
			String pass = request.getParameter("pass");
			int p = pD.validar(cedula, pass);
			if(p!=0) {
				HttpSession sesion = request.getSession();
				sesion.setAttribute("persona", p);
				response.sendRedirect("WebApp/inicio.jsp");
			}else {
				response.sendRedirect("index.jps");
		
				
			}
			
			
			
			break;
			
		case "cerrar":
			HttpSession session = request.getSession();
			session.invalidate();
			response.sendRedirect("../ConsultoriaZ/index.jsp");
			break;

		default:
			break;
		}

		
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String accion = request.getParameter("accion");
		
		switch (accion) {
		case "ingreso":
			String cedula = request.getParameter("cedula");
			String pass = request.getParameter("pass");
			int p = pD.validar(cedula, pass);
			if(p!=0) {
				HttpSession sesion = request.getSession();
				sesion.setAttribute("persona", p);
				response.sendRedirect("WebApp/inicio.jsp");
			}else {
				//response.sendRedirect("index.jsp");
				PrintWriter out = response.getWriter();
			   out.println("<script type=\"text/javascript\">");
			   out.println("alert('Usuario o Contraseña Incorrecta');");
			   out.println("location='index.jsp';");
			   out.println("</script>");
		
				
			}
			
			break;

		default:
			break;
		}
	}

}
