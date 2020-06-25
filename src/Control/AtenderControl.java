package Control;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.AtencionServicioDao;
import Dao.AtenderDao;
import Dto.AtencionServicio;
import Dto.Atender;
import Dto.Servicio;
import Dto.Tipo;

/**
 * Servlet implementation class AtenderControl
 */
@WebServlet("/AtenderControl")
public class AtenderControl extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private int var=0;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AtenderControl() {
    	
    	
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
		case "atenderServicio":
			Atender a = new Atender();
			AtenderDao aD = new AtenderDao(); 
			AtencionServicio as = new AtencionServicio();
			AtencionServicioDao asD = new AtencionServicioDao();
			Tipo t = new Tipo();
			Servicio s = new Servicio();
			String descripcion = request.getParameter("descripcion");
			String fecha = request.getParameter("fecha");
			String hora = request.getParameter("hora");
			//int servicio = Integer.parseInt(request.getParameter("ids"));
			//s.setId(servicio);
			int id = Integer.parseInt(request.getParameter("id"));
			s.setId(var);
			int tipo = Integer.parseInt(request.getParameter("tipo"));
			t.setId(tipo);
			String titulo = request.getParameter("nombre");
			a.setId(id);
			a.setDescripcion(descripcion);
			a.setTitulo(titulo);
			a.setTipo(t);
			as.setFecha(fecha);
			as.setHora(hora);
			as.setServicio(s);
			as.setAtender(a);
			aD.registrar(a);
			asD.registrar(as);
			response.sendRedirect("WebApp/inicioEmpleado.jsp");

			break;
			
		case "atenderS":
			response.sendRedirect("WebApp/atenderServicio.jsp");
			var = Integer.parseInt(request.getParameter("ids"));
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
		doGet(request, response);
	}

}
