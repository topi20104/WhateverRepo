package app;

import dao.Dao;
import data.questions;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
/**
 * Servlet implementation class ReadToUpdate
 */
@WebServlet("/questions2users")
public class questions2users extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Dao dao;
	public void init() {
		dao=new Dao("jdbc:mysql://localhost:3306/vaalikone", "topi", "assmen123");
	}
	public questions2users() {
	    super();
	    // TODO Auto-generated constructor stub
	}
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) 
	     throws IOException, ServletException {
		ArrayList<questions> list=null;
		if (dao.getConnection()) {
			list=dao.readAllQuestions();
		}
		request.setAttribute("questionslist", list);
		
		RequestDispatcher rd=request.getRequestDispatcher("/jsp/userAnswers.jsp");
		rd.forward(request, response);
	}
}