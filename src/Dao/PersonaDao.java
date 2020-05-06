package Dao;

import java.util.List;

import javax.persistence.EntityManager;

import Dto.Persona;
import Util.Conexion;


public class PersonaDao {
	
	EntityManager em=null;
	
	public PersonaDao() {
		em = Conexion.getEm();
		
		
	}
	
	public List<Persona> listar(){
		return (List<Persona>) em.createQuery("select x from Persona x").getResultList();	
		
	}
	
	
	 public void registrar (Persona persona) {
		 try {
			 em.getTransaction().begin();
			 em.persist(persona);
			 em.getTransaction().commit();
			 } catch (Exception e) {
			 e.printStackTrace();
			 }finally {
			 em.close();
			 }
		
		 
		 
	 }
	 
	 public void actualizar (Persona persona) {
		 try {
			 em.getTransaction().begin();
			 em.merge(persona);
			 em.getTransaction().commit();
			 } catch (Exception e) {
			 e.printStackTrace();
			 }finally {
			 em.close();
			 }
		
		 
		 
	 }
	 
	 public void eliminar (int id){
		 try {

			 Persona u = em.find(Persona.class, id);
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
			 Persona u = em.find(Persona.class, m);
			 em.getTransaction().commit();
			 //System.out.println(u.getUsuario());	
			  
			 } catch (Exception e) {
			 e.printStackTrace();
			 }finally {
			 em.close();
			 }
		
		 
		 
	 }

}
