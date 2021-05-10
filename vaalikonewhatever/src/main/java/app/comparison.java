package app;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import com.fasterxml.jackson.core.JsonProcessingException;

import data.restfulVastaus;


@Path("/comparison")
public class comparison implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@GET
	@Path("/query")
	@Produces(MediaType.APPLICATION_JSON)
	public static List<restfulVastaus> main(@Context UriInfo uriInfo) throws JsonProcessingException, IOException {
		String query = uriInfo.getRequestUri().getQuery();
		String[] urlArray = query.split("&");
		ArrayList<String> ehdokkaat = new ArrayList<>();
		ArrayList<Integer> userAnswers = new ArrayList<>();
		for (String a : urlArray) {
			String[] b = a.split("=");
			for (int i=1;i<b.length;i=i+2){
				int z = Integer.valueOf(b[i]);
				userAnswers.add(z);
	        }
		}
		String uri = "http://localhost:8080/rest/restful/readvastaukset";
		Client client = ClientBuilder.newClient();
		GenericType<List<restfulVastaus>> some = new GenericType<List<restfulVastaus>>() {};
		List<restfulVastaus> list = client.target(uri).request().get(some);
		for (restfulVastaus x:list){
			String candidate = x.getKayttajanimi();
			if (!ehdokkaat.contains(candidate)) {
				ehdokkaat.add(candidate);
			}
		}
		for (String name:ehdokkaat) {
			float toll = 0;
			ArrayList<Integer> canAnswers = new ArrayList<>();
			int count = 0;
			for (restfulVastaus x:list){
				if (x.getKayttajanimi().equals(name)) {
					int answer = x.getvastaus();
					canAnswers.add(answer);
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
			System.out.println(toll/userAnswers.size() * 100);
		}
		return list;
	}
}