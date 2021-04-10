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
    name = "update",
    urlPatterns = {"/update"}
)
public class update_ehdokkaat extends HttpServlet {
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
		String Ehdokas_ID=request.getParameter("id");
		String Sukunimi=request.getParameter("sukunimi");
		String Etunimi=request.getParameter("etunimi");
		String Puolue=request.getParameter("puolue");
		String Kotipaikkakunta= request.getParameter("kotipaikkakunta");
		String Ika=request.getParameter("ika");
		String Miksi=request.getParameter("miksi");
		String Mita=request.getParameter("mita");
		String Ammatti=request.getParameter("ammatti");
		String Salasana=request.getParameter("salasana");
		String Kayttajanimi=request.getParameter("kayttajanimi");
		
		ehdokas f=new ehdokas(Ehdokas_ID, Sukunimi, Etunimi, Puolue,  Kotipaikkakunta,  Ika,  Miksi,  Mita,  Ammatti, Salasana, Kayttajanimi);
		
		ArrayList<ehdokas> list=null;
		if (dao.getConnection()) {
			list=dao.updateehdokas(f);
		}
		
		request.setAttribute("ehdokaslist", list);
		RequestDispatcher rd=request.getRequestDispatcher("jsp/show_ehdokkaat.jsp");
		rd.forward(request, response);
	}
}