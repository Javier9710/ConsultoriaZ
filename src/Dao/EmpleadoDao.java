package Dao;

import java.util.List;

import javax.persistence.EntityManager;

import Dto.Empleado;
import Util.Conexion;


public class EmpleadoDao {
	
	EntityManager em=null;
	
	public EmpleadoDao() {
		em = Conexion.getEm();
		
		
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
			 em.close();
			 }
		
		 
		 
	 }
	 
	 public void eliminar (int id){
		 try {

			 Empleado u = em.find(Empleado.class, id);
			 em.getTransaction().begin();
			 em.remove(u);
			 em.getTransaction().commit();
			 } catch (Exception e) {
			 e.printStackTrace();
			 }finally {
			 em.close();
			 }
		
		 
		 
	 }
	 
	 public void buscar (Integer m) {
		 try {
			 em.getTransaction().begin();
			 Empleado u = em.find(Empleado.class, m);
			 em.getTransaction().commit();
			 //System.out.println(u.getUsuario());	
			  
			 } catch (Exception e) {
			 e.printStackTrace();
			 }finally {
			 em.close();
			 }
		
		 
		 
	 }

}
