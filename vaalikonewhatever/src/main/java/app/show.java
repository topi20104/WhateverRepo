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

@WebServlet(
    name = "show",
    urlPatterns = {"/show"}
)
public class show extends HttpServlet {
	private Dao dao;
	public void init() {
		dao=new Dao("jdbc:mysql://localhost:3306/vaalikone", "topi", "assmen123");
	}
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) 
	     throws IOException, ServletException {
		String Ehdokas_ID=request.getParameter("id");
		ehdokas f=null;
		if (dao.getConnection()) {
			f=dao.readehdokas(Ehdokas_ID);
		}
		request.setAttribute("ehdokasshow", f);
		RequestDispatcher rd=request.getRequestDispatcher("/jsp/show_ehdokas.jsp");
		rd.forward(request, response);
	}
}