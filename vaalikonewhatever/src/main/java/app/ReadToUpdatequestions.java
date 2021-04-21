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

/**
 * Servlet implementation class ReadToUpdate
 */
@WebServlet("/readtoupdatequestions")
public class ReadToUpdatequestions extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Dao dao;
	public void init() {
		dao=new Dao("jdbc:mysql://localhost:3306/vaalikone", "topi", "assmen123");
	}
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReadToUpdatequestions() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id=request.getParameter("id");
		questions f=null;
		if (dao.getConnection()) {
			f=dao.readQuestions(id);
		}
		request.setAttribute("questions", f);
		
		RequestDispatcher rd=request.getRequestDispatcher("/jsp/show_question.jsp");
		rd.forward(request, response);
	}
}
