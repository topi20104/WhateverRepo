package app;

import java.io.IOException;
import java.io.Serializable;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.fasterxml.jackson.core.JsonProcessingException;

import data.ehdokas;
import data.restfulVastaus;
import data.result;

@Path("/comparison")
public class comparison implements Serializable {

	private static final long serialVersionUID = 1L;
	HashMap<String,Float> map = new HashMap<String,Float>(); //A map for the percentages to associate them with each candidate
	LinkedHashMap<String, Float> SortedMap = new LinkedHashMap<>(); //LinkedHashMap preserve the ordering of elements in which they are inserted
	
	@Context
	HttpServletRequest request;
	@Context
	HttpServletResponse response;
	@POST
	@Path("/query")
	@Produces({MediaType.APPLICATION_JSON, MediaType.TEXT_HTML})
	public void main(@FormParam("1") int one, @FormParam("2") int two,@FormParam("3") int three,@FormParam("4") int four,@FormParam("5") int five,@FormParam("6") int six,@FormParam("7") int seven,@FormParam("8") int eight,@FormParam("9") int nine,@FormParam("10") int ten,@FormParam("11") int eleven,@FormParam("12") int twelve,@FormParam("13") int thirteen,@FormParam("14") int fourteen,@FormParam("15") int fifteen,@FormParam("16") int sixteen,@FormParam("17") int seventeen,@FormParam("18") int eighteen,@FormParam("19") int nineteen) throws JsonProcessingException, IOException, URISyntaxException, ServletException {
		
		HashMap<String, Integer> ehdokkaat1 = new HashMap<String, Integer>();
		ArrayList<Integer> userAnswers = new ArrayList<>();
		userAnswers.add(one);
		userAnswers.add(two);
		userAnswers.add(three);
		userAnswers.add(four);
		userAnswers.add(five);
		userAnswers.add(six);
		userAnswers.add(seven);
		userAnswers.add(eight);
		userAnswers.add(nine);
		userAnswers.add(ten);
		userAnswers.add(eleven);
		userAnswers.add(twelve);
		userAnswers.add(thirteen);
		userAnswers.add(fourteen);
		userAnswers.add(fifteen);
		userAnswers.add(sixteen);
		userAnswers.add(seventeen);
		userAnswers.add(eighteen);
		userAnswers.add(nineteen);

		String uri = "http://localhost:8080/rest/restful/readvastaukset";
		Client client = ClientBuilder.newClient();
		GenericType<List<restfulVastaus>> some = new GenericType<List<restfulVastaus>>() {};
		List<restfulVastaus> list = client.target(uri).request().get(some);
		
		for (restfulVastaus x:list) {
			String candidate = x.getKayttajanimi();
			if (!ehdokkaat1.containsKey(candidate)) {
				ehdokkaat1.put(candidate,null); //Puts data to the HashMap, sets the Integer as null for now
			}
		}
		
		//MySQL query to get the ehdokas_ID for each user based on the username
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("restful");
		EntityManager em=emf.createEntityManager();
		for (String name:ehdokkaat1.keySet()) { //For each loop based on the number of "keys" in the HashMap
			
			em.getTransaction().begin();
			Query query = em.createNativeQuery("SELECT e.Ehdokas_ID from ehdokkaat e WHERE e.Kayttajanimi = "+ '"' + name + '"'); //I don't like this syntax either, but it works
			int result =  (int) query.getSingleResult();
			//System.out.println(result); //Prints the ID that it gets
			em.getTransaction().commit();
			ehdokkaat1.replace(name, result);//Now replaces the null Ehdokas_IDs in the HashMap based on the name
		}
		em.close();
		
		ArrayList<result> list2 = getResults();
		result result = new result();
		
		for (String name:ehdokkaat1.keySet()) {
			float toll = 0;
			ArrayList<Integer> canAnswers = new ArrayList<>();
			int count = 0;
			for (restfulVastaus x:list) {
				if (x.getKayttajanimi().equals(name)) {
					int answer = x.getvastaus();
					canAnswers.add(answer);
					//Compares the user's answers to candidates' answers with absolute math
					int a = (Math.abs(userAnswers.get(count) - canAnswers.get(count)));
					if (a == 0) {
						toll += 1;
					}
					else if (a == 1) {
						toll += 0.75;
					}
					else if (a == 2) {
						toll += 0.5;
					}
					else if (a == 3) {
						toll += 0.25;
					}
					count++;
				}
			}
			
			result res = new result((toll/userAnswers.size() * 100), name, ehdokkaat1.get(name));
			list2.add(res);
			
		}
		//service
		
		//System.out.println(list2);
		 request.setAttribute("list", result);
		RequestDispatcher rd=request.getRequestDispatcher("/jsp/resultpage.jsp");
		
		request.setAttribute("list", list2);
		rd.forward(request,response);
		
	}
	@GET
	@Path("/GetResults")
	@Produces(MediaType.APPLICATION_JSON)
	public List<result> read () {
		String uri = "http://localhost:8080/rest/comparison/query";
		Client client = ClientBuilder.newClient();
		GenericType<List<result>> some = new GenericType<List<result>>() {};
		List<result> list3 = client.target(uri).request().get(some);
		return list3;
	}
		
	public ArrayList<result> getResults() {
		// TODO Auto-generated method stub
		ArrayList<result> list=new ArrayList<>();
		return list;
	}
}