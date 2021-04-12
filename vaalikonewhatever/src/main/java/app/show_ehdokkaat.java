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

/**
 * Servlet implementation class ReadToUpdate
 */
@WebServlet("/")
public class show_ehdokkaat extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Dao dao;
	public void init() {
		dao=new Dao("jdbc:mysql://localhost:3306/vaalikone", "topi", "assmen123");
	}
       
    public show_ehdokkaat() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		ArrayList<ehdokas> list=null;
		if (dao.getConnection()) {
			list=dao.readAllehdokas();
		}
		request.setAttribute("ehdokaslist", list);
		
		RequestDispatcher rd=request.getRequestDispatcher("/jsp/show_ehdokkaat.jsp");
		rd.forward(request, response);
	}
}
