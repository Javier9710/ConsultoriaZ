package Util;
import Dao.EmpleadoDao;
import Dao.PersonaDao;
import Dto.Cargo;
import Dto.Empleado;
import Dto.Persona;

public class Test {
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 //PersonaDao pD =new PersonaDao();
 EmpleadoDao eD = new EmpleadoDao();
 Empleado e = new Empleado();
 Persona p = new Persona();
 Cargo c =new Cargo();
 c.setId(1);
 p.setCedula("1090");
 e.setPersona(p);
 e.setPass("1234");
 e.setCargo(c);
 System.out.println("cedula: "+p.getCedula());
 System.out.println("pass: "+e.getPass());
 System.out.println("cargo: "+c.getId());
 eD.registrar(e);
 //pD.listar();
 //pD.buscar(3);
// eD.devuelveE(9);


	}

}
