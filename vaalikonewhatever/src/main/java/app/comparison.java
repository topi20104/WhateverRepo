package app;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.GenericType;

import data.restfulVastaus;



@Path("/comparison")
public class comparison {
	@GET
	@Consumes("application/x-www-form-urlencoded")
	public static void main(String[] args) {
		String uri = "http://localhost:8080/rest/restful/readvastaukset";
		Client client = ClientBuilder.newClient();
		//Create a new GenericType object
		GenericType<List<restfulVastaus>> some = new GenericType<List<restfulVastaus>>() {};
		
		//Read a list of DogBreed objects - here a short version 
		List<restfulVastaus> list = client.target(uri).request().get(some);
		
		//Print the contents of the list
		System.out.println("All the DogBreeds");
		for (restfulVastaus x:list){
			System.out.println(x);
		}
	}
}