package app;

import java.net.URISyntaxException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


import data.questions;
import data.restfulVastaus;
import data.restfulVastausDelete;

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
	@Path("/readvastaukset")
	@Produces(MediaType.APPLICATION_JSON)
	public List<restfulVastaus> readvastaus() {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("restful");
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		@SuppressWarnings("unchecked")
		List<restfulVastaus> list=em.createQuery("select a from restfulVastaus a").getResultList();
		em.getTransaction().commit();
		return list;
	}
	
	
	@POST
    @Path("/deleteAnswer/{Kayttajanimi}")
	@Produces(MediaType.TEXT_HTML)
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public List<restfulVastausDelete> deleteAnswer(@PathParam("Kayttajanimi") String Kayttajanimi) {
	restfulVastausDelete ans=new restfulVastausDelete(Kayttajanimi);
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("restful");
	EntityManager em=emf.createEntityManager();
	em.getTransaction().begin();
	if (!em.contains(ans)) {
		ans = em.merge(ans);
		em.remove(ans);
	}
	em.getTransaction().commit();
	System.out.println("test");
		return null;
        
    }
    
    
	
    @POST
    @Path("/addquestion")
	@Consumes("application/x-www-form-urlencoded") //Method can receive POSTed data from a html form
    	
	public void AddQuestions (@FormParam("kysymys") String kysymys) {

		EntityManagerFactory emf=Persistence.createEntityManagerFactory("restful");
    	EntityManager em=emf.createEntityManager();

    	em.getTransaction().begin();
    	
    	//New question object
    	questions question = new questions();
    	
    	//Sets the question value | Question ID is auto_increment so no need to set that value
    	question.setKysymys(kysymys);
    	question.setId(0);
    	
    	//Commit the changes
    	em.persist(question);
    	em.getTransaction().commit();
    	em.close();

    	//Redirects to the home page after submitting a questions
    	try {
            java.net.URI location = new java.net.URI("../");
            throw new WebApplicationException(Response.temporaryRedirect(location).build());
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
	}
}
