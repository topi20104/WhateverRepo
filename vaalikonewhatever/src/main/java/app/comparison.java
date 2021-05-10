package app;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

import java.util.List;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import com.fasterxml.jackson.core.JsonProcessingException;
import data.restfulVastaus;

@Path("/comparison")
public class comparison implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@POST
	@Path("/query")
	@Produces(MediaType.APPLICATION_JSON)
	public List<restfulVastaus> main(@FormParam("1") int one, @FormParam("2") int two,@FormParam("3") int three,@FormParam("4") int four,@FormParam("5") int five,@FormParam("6") int six,@FormParam("7") int seven,@FormParam("8") int eight,@FormParam("9") int nine,@FormParam("10") int ten,@FormParam("11") int eleven,@FormParam("12") int twelve,@FormParam("13") int thirteen,@FormParam("14") int fourteen,@FormParam("15") int fifteen,@FormParam("16") int sixteen,@FormParam("17") int seventeen,@FormParam("18") int eighteen,@FormParam("19") int nineteen) throws JsonProcessingException, IOException {
		//A map for the percentages to associate them with each candidate
		HashMap<String,Float> map=new HashMap<String,Float>();//Creating HashMap
		
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
			map.put(name, (toll/userAnswers.size() * 100));//Calculating the percentage and adding the entry to the map
		}
		for(HashMap.Entry m : map.entrySet())//Simple for loop to print each key and value
		System.out.println(m.getKey() + " " + m.getValue() + " %");//Printing each 
		String key = Collections.max(map.entrySet(), HashMap.Entry.comparingByValue()).getKey();
		System.out.println("Maximum similarity with: " + key);

		return list;
	}
}