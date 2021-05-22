package app;

import java.io.IOException;

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
import data.restfulVastausDelete;
import data.vastaus;

@WebServlet(
    name = "saveResults",
    urlPatterns = {"/saveResults"}
)
public class saveResults extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Dao dao;
	public void init() {
		dao=new Dao("jdbc:mysql://localhost:3306/vaalikone", "topi", "assmen123");
	}
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) 
	     throws IOException {
		
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response) 
	     throws IOException, ServletException {
			HttpSession session = request.getSession();
			String answer = "";
			String Kayttajanimi = session.getAttribute("username").toString();
			EntityManagerFactory emf=Persistence.createEntityManagerFactory("restful");
			restfulVastausDelete del=new restfulVastausDelete(Kayttajanimi);
			EntityManager em=emf.createEntityManager();
			em.getTransaction().begin();
			if (!em.contains(del)) {
				del = em.merge(del);
				em.remove(del);
			}
			em.getTransaction().commit();
						
			int QID = 0;
			for (int i=1;i<20;i++) {
				String comm ="comment" + Integer.toString(i);
				String comment = request.getParameter(comm);
				String test = Integer.toString(i);
				String ans = request.getParameter(test);
				QID++;
				System.out.println("Question id " + QID);
				System.out.println(ans);
				System.out.println(answer);
				vastaus f=new vastaus(Kayttajanimi, ans, QID, comment);
				System.out.println(answer);
				if (dao.getConnection()) {
					dao.insertAnswers(f);
					continue;
				}
			}
			RequestDispatcher rd=request.getRequestDispatcher("/jsp/CandidateSavedResults.jsp");
			rd.forward(request,response);
	}
}