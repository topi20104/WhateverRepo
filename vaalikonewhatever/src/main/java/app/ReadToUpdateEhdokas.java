package app;

import dao.Dao;
import data.ehdokas;

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
@WebServlet("/readtoupdateehdokasshow")
public class ReadToUpdateEhdokas extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Dao dao;
	public void init() {
		dao=new Dao("jdbc:mysql://localhost:3306/vaalikone", "topi", "assmen123");
	}
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReadToUpdateEhdokas() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id=request.getParameter("id");
		ehdokas g=null;
		if (dao.getConnection()) {
			g=dao.readehdokasshow(id);
		}
		request.setAttribute("ehdokasshow", g);
		
		RequestDispatcher rd=request.getRequestDispatcher("/jsp/show_ehdokas.jsp");
		rd.forward(request, response);
	}
}
