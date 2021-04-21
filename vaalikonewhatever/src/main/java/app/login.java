package app;

import dao.Dao;
import dao.UserDao;
import data.ehdokas;
import data.user;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
 
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
		
		
    }
 
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String Kayttajanimi = request.getParameter("Kayttajanimi");
        String Salasana     = request.getParameter("Salasana");
        
         
        UserDao userDao = new UserDao();
         
        try {
             user user = userDao.checkLogin(Kayttajanimi, Salasana);
             String username = Kayttajanimi;
             String password = Salasana;
             
            
             
            if (user != null) {
                HttpSession session = request.getSession();
                session.setAttribute("username", username);
                session.setAttribute("salasana", password);
               
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