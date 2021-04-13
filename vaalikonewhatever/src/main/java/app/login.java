package app;
 
import java.io.*;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import dao.Dao;
import dao.UserDao;
import data.ehdokas;
import data.user;
 
@WebServlet("/login")
public class login extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private Dao dao;
    public void init() {
		dao=new Dao("jdbc:mysql://localhost:3306/vaalikone", "topi", "assmen123");
	}
 
    public login() {
        super();
    }
    ArrayList<ehdokas> list=null;
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		if (dao.getConnection()) {
			list=dao.readAllehdokas();
		}
    }
 
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String Kayttajanimi = request.getParameter("Kayttajanimi");
        String Salasana     = request.getParameter("Salasana");
        String Ehdokas_ID		= request.getParameter("Ehdokas_ID");
         
        UserDao userDao = new UserDao();
         
        try {
             user user = userDao.checkLogin(Kayttajanimi, Salasana);
             String username = Kayttajanimi;
             String password = Salasana;
             String id = Ehdokas_ID;
            
             
            if (user != null) {
                HttpSession session = request.getSession();
                session.setAttribute("user", user);
                session.setAttribute("id",id);
                session.setAttribute("username", username);
                session.setAttribute("salasana", password);
                session.setAttribute("ehdokaslist", list);
               
            } else {
                String message = "Invalid email/password";
                request.setAttribute("message", message);
            }
            String redirect = "http://localhost:8080";
            response.sendRedirect(redirect);
           
            
             
        } catch (SQLException | ClassNotFoundException ex) {
            throw new ServletException(ex);
        }
    }
}