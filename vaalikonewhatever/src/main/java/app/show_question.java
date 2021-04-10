package app;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Dao;
import data.ehdokas;
import data.questions;

@WebServlet(
    name = "show_question",
    urlPatterns = {"/show_question"}
)
public class show_question extends HttpServlet {
	private Dao dao;
	public void init() {
		dao=new Dao("jdbc:mysql://localhost:3306/vaalikone", "topi", "assmen123");
	}
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) 
	     throws IOException, ServletException {
		String Kysymys_ID=request.getParameter("id");
		questions f=null;
		if (dao.getConnection()) {
			f=dao.readQuestions(Kysymys_ID);
		}
		request.setAttribute("questionshow", f);
		RequestDispatcher rd=request.getRequestDispatcher("/jsp/show_question.jsp");
		rd.forward(request, response);
	}
}