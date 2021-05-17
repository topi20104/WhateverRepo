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
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.fasterxml.jackson.core.JsonProcessingException;
import data.restfulVastaus;
import data.result;

@Path("/comparison")
public class comparison implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//A map for the percentages to associate them with each candidate
	HashMap<String,Float> map = new HashMap<String,Float>();
	//LinkedHashMap preserve the ordering of elements in which they are inserted
	LinkedHashMap<String, Float> SortedMap = new LinkedHashMap<>();

	@POST
	@Path("/query")
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<result> main(@FormParam("1") int one, @FormParam("2") int two,@FormParam("3") int three,@FormParam("4") int four,@FormParam("5") int five,@FormParam("6") int six,@FormParam("7") int seven,@FormParam("8") int eight,@FormParam("9") int nine,@FormParam("10") int ten,@FormParam("11") int eleven,@FormParam("12") int twelve,@FormParam("13") int thirteen,@FormParam("14") int fourteen,@FormParam("15") int fifteen,@FormParam("16") int sixteen,@FormParam("17") int seventeen,@FormParam("18") int eighteen,@FormParam("19") int nineteen) throws JsonProcessingException, IOException, URISyntaxException {
		
		ArrayList<String> ehdokkaat = new ArrayList<>();
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
			if (!ehdokkaat.contains(candidate)) {
				ehdokkaat.add(candidate);
			}
		}
		ArrayList<result> list2 = getResults();
		result res = new result(null, null);
		for (String name:ehdokkaat) {
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
			
			res = new result((toll/userAnswers.size() * 100), name);
			list2.add(res);
			
		}
		//service
		
		return list2;
	}
	@GET
	@Path("/GetResults")
	@Produces(MediaType.APPLICATION_JSON)
	public List<result> read () {
		String uri = "http://localhost:8080/rest/comparison/query";
		Client client = ClientBuilder.newClient();
		GenericType<List<restfulVastaus>> some = new GenericType<List<restfulVastaus>>() {};
		List<restfulVastaus> list3 = client.target(uri).request().get(some);
		return list3;
		
	}
		
	public ArrayList<result> getResults() {
		// TODO Auto-generated method stub
		ArrayList<result> list=new ArrayList<>();
		
		
		return list;
	}
	
}


