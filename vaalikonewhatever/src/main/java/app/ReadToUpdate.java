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
@WebServlet("/readtoupdate")
public class ReadToUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Dao dao;
	public void init() {
		dao=new Dao("jdbc:mysql://localhost:3306/vaalikone", "topi", "assmen123");
	}
       
    public ReadToUpdate() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id=request.getParameter("id");
		ehdokas f=null;
		if (dao.getConnection()) {
			f=dao.readehdokas(id);
		}
		request.setAttribute("ehdokas", f);
		
		RequestDispatcher rd=request.getRequestDispatcher("/jsp/update_ehdokkaat.jsp");
		rd.forward(request, response);
	}
}
