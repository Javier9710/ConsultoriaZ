package Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.servlet.http.Part;
import Dto.Servicio;
import Util.Conexion;

public class ServicioDao {

	EntityManager em = null;

	public ServicioDao() {
		em = Conexion.getEm();

	}



	
	public List<Servicio> listar1(){
		return (List<Servicio>) em.createQuery("SELECT s from Servicio s").getResultList();	
		
	}

	

	public void registrar(Servicio servicio) {
		try {
			em.getTransaction().begin();
			em.persist(servicio);
			em.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// em.close();
		}

	}

	public void actualizar(Servicio servicio) {
		try {
			em.getTransaction().begin();
			em.merge(servicio);
			em.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//em.close();
		}

	}

	public void eliminar(int id) {
		try {

			Servicio u = em.find(Servicio.class, id);
			em.getTransaction().begin();
			em.remove(u);
			em.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//em.close();
		}

	}

	public int buscar(int m) {
		int id=0;
		try {
			em.getTransaction().begin();
			Servicio u = em.find(Servicio.class, m);
			em.getTransaction().commit();
			//System.out.println(u.getNombre());
			//id=u.getId();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//em.close();
		}
		
		return id;

	}
	
	public String fileName(final Part part) {
	    for (String content : part.getHeader("content-disposition").split(";")) {
	        if (content.trim().startsWith("filename")) {
	            return content.substring(
	                    content.indexOf('=') + 1).trim().replace("\"", "");
	        }
	    }
	    return null;
	}

}
