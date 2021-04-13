package app;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.Dao;
import data.ehdokas;

@WebServlet(
    name = "saveResults",
    urlPatterns = {"/saveResults"}
)
public class saveResults extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) 
	     throws IOException {
		
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response) 
	     throws IOException, ServletException {
			HttpSession session = request.getSession();
			String answer1 = request.getParameter("1");
			String answer2 = request.getParameter("2");
			String answer3 = request.getParameter("3");
			String answer4 = request.getParameter("4");
			String answer5 = request.getParameter("5");
			String answer6 = request.getParameter("6");
			String answer7 = request.getParameter("7");
			String answer8 = request.getParameter("8");
			String answer9 = request.getParameter("9");
			String answer10 = request.getParameter("10");
			String answer11 = request.getParameter("11");
			String answer12 = request.getParameter("12");
			String answer13 = request.getParameter("13");
			String answer14 = request.getParameter("14");
			String answer15 = request.getParameter("15");
			String answer16 = request.getParameter("16");
			String answer17 = request.getParameter("17");
			String answer18 = request.getParameter("18");
			String answer19 = request.getParameter("19");
			String test = session.getAttribute("username").toString();
			
			
			System.out.println(answer1);
			System.out.println(answer2);
			System.out.println(answer3);
			System.out.println(answer4);
			System.out.println(answer5);
			System.out.println(answer6);
			System.out.println(answer7);
			System.out.println(test);
			
			
	}
}