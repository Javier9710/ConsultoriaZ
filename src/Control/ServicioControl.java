package Control;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.ServicioDao;
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
			Persona p = new Persona();
			Servicio s =new Servicio();
			Cliente c = new Cliente();
			Empleado e = new Empleado();
			String nombre = request.getParameter("nombre");
			float precio = Float.parseFloat( request.getParameter("precio"));
			String empleado = request.getParameter("empleado");
			String cliente = request.getParameter("cliente");
			String descripcion = request.getParameter("descripcion");
			//cast a fecha
			
			String fechai = request.getParameter("fechai");
			
			String fechaf = request.getParameter("fechaf");

			p.setCedula(empleado);
			c.setNit(cliente);
			e.setPersona(p);
			s.setNombre(nombre);
			s.setPrecio(precio);
			s.setCliente(c);
			s.setEmpleado(e);
			s.setFecha(fechai);
			s.setFechaFin(fechaf);
			s.setDescripcion(descripcion);
			sD.registrar(s);
			response.sendRedirect("WebApp/regServicio.jsp");

			
			break;

		case "eliminar":
			int id = Integer.parseInt(request.getParameter("id"));
			ServicioDao sD1  = new ServicioDao();
			sD1.eliminar(id);
			response.sendRedirect("WebApp/listarServicio.jsp");
		
			break;
			
			
		case "listar":
			ServicioDao AD = new ServicioDao();
			response.sendRedirect("WebApp/listarServicio.jsp");
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
