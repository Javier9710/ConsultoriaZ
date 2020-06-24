package Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import Dto.Empleado;
import Dto.Persona;
import Util.Conexion;


public class EmpleadoDao {
	
	EntityManager em=null;
	
	public EmpleadoDao() {
		em = Conexion.getEm();
		
		
	}
	
	
	public Persona validar(String cedula1, String pass1) {
		Persona p = new Persona();
		 Query nativeQuery = em.createNativeQuery("SELECT cedula,edad FROM Persona p, Empleado a "
		 		                                 + "WHERE p.cedula =? "
		 		                                 + "and p.cedula=a.persona "
		 		                                 + "and a.pass=?");
	        nativeQuery.setParameter(1, cedula1);
	        nativeQuery.setParameter(2, pass1);
	        Object[] result = (Object[]) nativeQuery.getSingleResult();
	        p.setCedula((String) result[0]);
	        p.setEdad((Integer) result[1]);
	      

	       
	
		return p;
	}
	
	public List<Empleado> listar(){
		return (List<Empleado>) em.createQuery("select x from Empleado x").getResultList();	
		
	}
	
	
	 public void registrar (Empleado empleado) {
		 try {
			 em.getTransaction().begin();
			 em.persist(empleado);
			 em.getTransaction().commit();
			 } catch (Exception e) {
			 e.printStackTrace();
			 }finally {
			 //em.close();
			 }
		
		 
		 
	 }
	 
	 public void actualizar (Empleado empleado) {
		 try {
			 em.getTransaction().begin();
			 em.merge(empleado);
			 em.getTransaction().commit();
			 } catch (Exception e) {
			 e.printStackTrace();
			 }finally {
			// em.close();
			 }
		
		 
		 
	 }
	 
	 public void eliminar (String id){
		 try {

			 Empleado u = em.find(Empleado.class, id);
			 em.getTransaction().begin();
			 em.remove(u);
			 em.getTransaction().commit();
			 } catch (Exception e) {
			 e.printStackTrace();
			 }finally {
			 //em.close();
			 }
		
		 
		 
	 }
	 
/*	 
	 public String devuelveE(String x) {
		 String y="";
		 Query nativeQuery = em.createNativeQuery("SELECT persona FROM Empleado WHERE persona = ?");
	        nativeQuery.setParameter(1, x);
	        String result = (String) nativeQuery.getSingleResult();
	        Empleado e = new Empleado();
	        e.setPersona(result);;
	        y=e.getId();
	      
		 return y;
	 }*/
	 
	 public void buscar (Integer m) {
		 try {
			 em.getTransaction().begin();
			 Empleado u = em.find(Empleado.class, m);
			 em.getTransaction().commit();
			 //System.out.println(u.getUsuario());	
			  
			 } catch (Exception e) {
			 e.printStackTrace();
			 }finally {
			// em.close();
			 }
		
		 
		 
	 }

}
