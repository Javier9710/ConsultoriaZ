package Dao;

import java.util.List;

import javax.persistence.EntityManager;
import Dto.AsesoriaTi;
import Util.Conexion;

public class AsesoriaDao {
	
	EntityManager em=null;
	
	public AsesoriaDao() {
		em = Conexion.getEm();
		
		
	}
	
	public List<AsesoriaTi> listar(){
		return (List<AsesoriaTi>) em.createQuery("select c from Cliente c").getResultList();	
		
	}
	
	
	 public void registrar (AsesoriaTi asesoriaTi) {
		 try {
			 em.getTransaction().begin();
			 em.persist(asesoriaTi);
			 em.getTransaction().commit();
			 } catch (Exception e) {
			 e.printStackTrace();
			 }finally {
			 //em.close();
			 }
		
		 
		 
	 }
	 
	 public void actualizar (AsesoriaTi asesoriaTi) {
		 try {
			 em.getTransaction().begin();
			 em.merge(asesoriaTi);
			 em.getTransaction().commit();
			 } catch (Exception e) {
			 e.printStackTrace();
			 }finally {
			// em.close();
			 }
		
		 
		 
	 }
	 
	 public void eliminar (String id){
		 try {

			 AsesoriaTi u = em.find(AsesoriaTi.class, id);
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
			 AsesoriaTi u = em.find(AsesoriaTi.class, m);
			 em.getTransaction().commit();
			 //System.out.println(u.getUsuario());	
			  
			 } catch (Exception e) {
			 e.printStackTrace();
			 }finally {
			// em.close();
			 }
		
		 
		 
	 }

}
