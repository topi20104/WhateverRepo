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
import java.util.ArrayList;

@WebServlet(
    name = "delete",
    urlPatterns = {"/delete"}
)
public class delete extends HttpServlet {
	private Dao dao;
	public void init() {
		dao=new Dao("jdbc:mysql://localhost:3306/vaalikone", "topi", "assmen123");
	}
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) 
	     throws IOException, ServletException {
		String Ehdokas_ID=request.getParameter("id");
		ArrayList<ehdokas> list=null;
		if (dao.getConnection()) {
			list=dao.deleteehdokas(Ehdokas_ID);
		}
		request.setAttribute("ehdokaslist", list);
		RequestDispatcher rd=request.getRequestDispatcher("/jsp/show_ehdokkaat.jsp");
		rd.forward(request, response);
	}
}