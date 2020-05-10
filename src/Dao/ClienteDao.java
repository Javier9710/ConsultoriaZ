package Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import Dto.Cliente;
import Util.Conexion;


public class ClienteDao {
	
	EntityManager em=null;
	
	public ClienteDao() {
		em = Conexion.getEm();
		
		
	}
	
	public List<Cliente> listar(){
		return (List<Cliente>) em.createQuery("select c from Cliente c").getResultList();	
		
	}
	
	
	 public void registrar (Cliente cliente) {
		 try {
			 em.getTransaction().begin();
			 em.persist(cliente);
			 em.getTransaction().commit();
			 } catch (Exception e) {
			 e.printStackTrace();
			 }finally {
			 //em.close();
			 }
		
		 
		 
	 }
	 
	 public void actualizar (Cliente cliente) {
		 try {
			 em.getTransaction().begin();
			 em.merge(cliente);
			 em.getTransaction().commit();
			 } catch (Exception e) {
			 e.printStackTrace();
			 }finally {
			// em.close();
			 }
		
		 
		 
	 }
	 
	 public void eliminar (String id){
		 try {

			 Cliente u = em.find(Cliente.class, id);
			 em.getTransaction().begin();
			 em.remove(u);
			 em.getTransaction().commit();
			 } catch (Exception e) {
			 e.printStackTrace();
			 }finally {
			 //em.close();
			 }
		
		 
		 
	 }

	 
	 public void buscar (Integer m) {
		 try {
			 em.getTransaction().begin();
			 Cliente u = em.find(Cliente.class, m);
			 em.getTransaction().commit();
			 //System.out.println(u.getUsuario());	
			  
			 } catch (Exception e) {
			 e.printStackTrace();
			 }finally {
			// em.close();
			 }
		
		 
		 
	 }

}
