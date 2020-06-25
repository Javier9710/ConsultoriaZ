package Dao;

import java.util.List;

import javax.persistence.EntityManager;

import Dto.Atender;
import Dto.Cliente;
import Util.Conexion;

public class AtenderDao {

	
	EntityManager em=null;
	
	
	public AtenderDao() {
		em = Conexion.getEm();
		
	}
	
	public List<Atender> listar(){
		return (List<Atender>) em.createQuery("select c from Atender c").getResultList();	
		
	}
	
	 public void registrar (Atender atender) {
		 try {
			 em.getTransaction().begin();
			 em.persist(atender);
			 em.getTransaction().commit();
			 } catch (Exception e) {
			 e.printStackTrace();
			 }finally {
			 //em.close();
			 }
		
		 
		 
	 }
	
}
