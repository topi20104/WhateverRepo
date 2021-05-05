package app;

import java.util.ArrayList;
import java.util.List;

import data.vastaus;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/*
 * URI to this service's Root Resource class is /laptopservice
 * The whole URL is http://some.server.someplace/rest/laptopservice
 * where some.server.someplace is the address to the server's web server (e.g. localhost:8080)
 * rest comes from the project web.xml file (element url-pattern)
 * laptopservice is the value of @Path below
 */
@Path("/restful")
public class Restful {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("restful");

	
	@GET
	@Path("/readvastaus")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public List<vastaus> readvastaus() {
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		List<vastaus> list=em.createQuery("select a from vastaukset a").getResultList();
		em.getTransaction().commit();
		return list;
	}
	
	
	@DELETE
    @Path("/deleteAnswer/{Kayttajanimi}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public List<vastaus> deleteCandidate(@PathParam("Kayttajanimi") String Kayttajanimi) {
        EntityManager em=emf.createEntityManager();
        em.getTransaction().begin();
        vastaus v=em.find(vastaus.class, Kayttajanimi);
        if (v!=null) {
            em.remove(v);//The actual insertion line
        }
        em.getTransaction().commit();
        //Calling the method readFish() of this service
        List<vastaus> list=readvastaus();        
        return list;
    }
	
	
}
