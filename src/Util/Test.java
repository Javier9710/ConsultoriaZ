package Util;
import Dao.EmpleadoDao;
import Dao.PersonaDao;
import Dto.Cargo;
import Dto.Empleado;
import Dto.Persona;

public class Test {
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p = new Persona();
		Persona p1 = new Persona();
		
		PersonaDao pD = new PersonaDao();
		Empleado e = new Empleado();
		EmpleadoDao eD= new EmpleadoDao();
		Cargo c =new Cargo();
		
		c.setId(1);
		p.setCedula("1091");
		p.setNombre("andres");
		p.setEdad(23);
		p.setTelefono("312");
		p.setFoto("ruta");
		pD.registrar(p);
		e.setPass("1234");
		e.setCargo(c);
		e.setPersona(p1);
		p1.setId(p.getId());
		eD.registrar(e);

	}

}
