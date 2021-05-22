package app;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Dao;
import data.ehdokas;

/**
 * Servlet implementation class ReadToUpdate
 */
@WebServlet("/readtoupdateehdokasshow2")
public class ReadToUpdateEhdokas2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Dao dao;
	public void init() {
		dao=new Dao("jdbc:mysql://localhost:3306/vaalikone", "topi", "assmen123");
	}
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReadToUpdateEhdokas2() {
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
		
		RequestDispatcher rd=request.getRequestDispatcher("/jsp/show_ehdokas2.jsp");
		rd.forward(request, response);
	}
}
