
package app;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.ws.rs.Produces;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.client.Invocation.Builder;

import dao.Dao;
import data.ehdokas;
import data.questions;
import data.restfulVastaus;
import data.result;
import app.comparison;
/**
 * Servlet implementation class ReadToUpdate
 */
@WebServlet("/resultpage")
public class resultpage extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public resultpage() {
	    super();
	    // TODO Auto-generated constructor stub
	}
	@Override
	@Produces({MediaType.APPLICATION_JSON, MediaType.TEXT_HTML})
	public void doPost(HttpServletRequest request, HttpServletResponse response) 
	     throws IOException, ServletException {
		 response.setContentType("text/plain");
		 response.setCharacterEncoding("UTF-8");
		 String uri = "http://localhost:8080/rest/comparison/query";
		 
		Client client = ClientBuilder.newClient();
		WebTarget wt=client.target(uri);
		Builder b=wt.request();
		
		GenericType<List<result>> genericList = new GenericType<List<result>>() {};
		
		List<result> returnedList=b.get(genericList);
		System.out.println("Test");
//		 request.setAttribute("resultlist", returnedList);
		 
		 
		RequestDispatcher rd=request.getRequestDispatcher("/jsp/resultpage.jsp");
		rd.forward(request, response);
	}
	
}