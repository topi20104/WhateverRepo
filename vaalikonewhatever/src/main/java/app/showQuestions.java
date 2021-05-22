package app;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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

import dao.Dao;
import data.ehdokas;
import data.questions;
import data.restfulVastaus;
import data.restfulVastausDelete;
/**
 * Servlet implementation class ReadToUpdate
 */
@WebServlet("/Questions")
public class showQuestions extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Dao dao;
	public void init() {
		dao=new Dao("jdbc:mysql://localhost:3306/vaalikone", "topi", "assmen123");
	}
	public showQuestions() {
	    super();
	    // TODO Auto-generated constructor stub
	}
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) 
	     throws IOException, ServletException {
		ArrayList<questions> list=null;
		HttpSession session = request.getSession();
		String a = (String) session.getAttribute("username");
		System.out.println(a);
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("restful");
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		List<restfulVastaus> list2=em.createQuery("select a from restfulVastaus a").getResultList();
		em.getTransaction().commit();
		session.setAttribute("test", list2);
		
		
		if (dao.getConnection()) {
			list=dao.readAllQuestions();
		}
		request.setAttribute("questionslist", list);
		
		RequestDispatcher rd=request.getRequestDispatcher("/jsp/Questions.jsp");
		rd.forward(request, response);
	}
}