package app;

import java.util.ArrayList;
import java.util.List;


import data.restfulVastaus;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
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
	@GET
	@Path("/name")
	public String getServiceName() {
		return ("This is Hunterservice");
	}
	

	
	@GET
	@Path("/readvastaukset")
	@Produces(MediaType.APPLICATION_JSON)
	public List<restfulVastaus> readvastaus() {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("restful");
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		List<restfulVastaus> list=em.createNativeQuery("select * from vastaukset").getResultList();
		em.getTransaction().commit();
			return list;
	}
	
	@GET
	@Path("/show/{Kayttajanimi}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<restfulVastaus> readcandidateanswers(@PathParam("Kayttajanimi") String Kayttajanimi) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("restful");
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		List<restfulVastaus> list=em.createNativeQuery("select * from vastaukset where Kayttajanimi=").getResultList();
		
		em.getTransaction().commit();
			return list;
	}
	
	
	@DELETE
    @Path("/deleteAnswer/{Kayttajanimi}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public List<restfulVastaus> deleteCandidate(@PathParam("Kayttajanimi") String Kayttajanimi) {
    	EntityManagerFactory emf=Persistence.createEntityManagerFactory("restful");
    	EntityManager em=emf.createEntityManager();
        em.getTransaction().begin();
        restfulVastaus v=em.find(restfulVastaus.class, Kayttajanimi);
        if (v!=null) {
            em.remove(v);//The actual insertion line
        }
        em.getTransaction().commit();
        //Calling the method readFish() of this service
        List<restfulVastaus> list=readvastaus();        
        return list;
    }
	
    @POST
    @Path("/addquestion")
    @Produces(MediaType.APPLICATION_JSON)//Method returns object as a JSON string
	@Consumes("application/x-www-form-urlencoded") //Method can receive POSTed data from a html form
    	
    //This method can be converted into void, but currently it is a string for debugging purposes
	public String AddQuestions (@FormParam("kysymys") String kysymys) {
		System.out.println("Before anything");
    	EntityManager em=emf.createEntityManager();
    	System.out.println("Before transaction");
    	em.getTransaction().begin();
    	
    	//New question object
    	questions question = new questions();
    	
    	//Sets the question value | Question ID is auto_increment so no need to set that value
    	question.setKysymys(kysymys);
    	question.setId(0);
    	
    	//Commit the changes
    	em.persist(question);
    	em.getTransaction().commit();
    	System.out.println("After transaction");
    	em.close();
    	
    	
		return kysymys;
	}
}
