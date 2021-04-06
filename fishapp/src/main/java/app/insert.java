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
    name = "insert",
    urlPatterns = {"/insert"}
)
public class insert extends HttpServlet {
	private Dao dao;
	public void init() {
		dao=new Dao("jdbc:mysql://localhost:3306/vaalikone", "topi", "assmen123");
	}
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) 
	     throws IOException {
		
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response) 
	     throws IOException, ServletException {
		String Sukunimi=request.getParameter("etunimi");
		String Etunimi=request.getParameter("sukunimi");
		String Puolue=request.getParameter("puolue");
		String Kotipaikkakunta= request.getParameter("kotipaikkakunta");
		String Ika=request.getParameter("ika");
		String Miksi=request.getParameter("miksi");
		String Mita=request.getParameter("mita");
		String Ammatti=request.getParameter("ammatti");
		
		ehdokas f=new ehdokas(Etunimi,  Sukunimi,  Puolue,  Kotipaikkakunta,  Ika,  Miksi,  Mita,  Ammatti);
		
		ArrayList<ehdokas> list=null;
		if (dao.getConnection()) {
			list=dao.insertehdokas(f);
		}
		
		request.setAttribute("ehdokaslist", list);
		RequestDispatcher rd=request.getRequestDispatcher("/jsp/show_ehdokkaat.jsp");
		rd.forward(request, response);
	}
}