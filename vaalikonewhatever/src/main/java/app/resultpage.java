
package app;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
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
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;
import javax.ws.rs.client.Invocation.Builder;

import dao.Dao;
import data.ehdokas;
import data.questions;
import data.restfulVastaus;
import app.comparison;
/**
 * Servlet implementation class ReadToUpdate
 */
@WebServlet("/resultpage")
public class resultpage extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Dao dao;
	public void init() {
		dao=new Dao("jdbc:mysql://localhost:3306/vaalikone", "topi", "assmen123");
	}
	public resultpage() {
	    super();
	    // TODO Auto-generated constructor stub
	}
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) 
	     throws IOException, ServletException {
		 response.setContentType("text/plain");
		 response.setCharacterEncoding("UTF-8");
		 

		RequestDispatcher rd=request.getRequestDispatcher("/jsp/resultpage.jsp");
		rd.forward(request, response);
	}
}