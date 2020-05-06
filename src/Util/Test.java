package Util;
import Dao.EmpleadoDao;
import Dao.PersonaDao;
import Dto.Cargo;
import Dto.Empleado;
import Dto.Persona;

public class Test {
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 PersonaDao pD =new PersonaDao();
 EmpleadoDao eD = new EmpleadoDao();
 //pD.listar();
 //pD.buscar(3);
 eD.devuelveE(9);


	}

}
