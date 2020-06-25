package Dao;

import java.util.List;

import javax.persistence.EntityManager;

import Dto.AtencionServicio;
import Dto.Atender;
import Util.Conexion;

public class AtencionServicioDao {
	
	EntityManager em=null;	
	
	public AtencionServicioDao() {
		em = Conexion.getEm();
		
	}
	
	public List<AtencionServicio> listar(){
		return (List<AtencionServicio>) em.createQuery("select c from AtencionServicio c").getResultList();	
		
	}
	
	 public void registrar (AtencionServicio atencionServicio) {
		 try {
			 em.getTransaction().begin();
			 em.persist(atencionServicio);
			 em.getTransaction().commit();
			 } catch (Exception e) {
			 e.printStackTrace();
			 }finally {
			 //em.close();
			 }
		
		 
		 
	 }

}
