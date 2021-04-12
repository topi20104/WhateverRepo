package app;
 
import java.io.*;
import java.sql.SQLException;
 
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import dao.UserDao;
import data.user;
 
@WebServlet("/login")
public class login extends HttpServlet {
    private static final long serialVersionUID = 1L;
 
    public login() {
        super();
    }
 
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String Kayttajanimi = request.getParameter("Kayttajanimi");
        String Salasana     = request.getParameter("Salasana");
         
        UserDao userDao = new UserDao();
         
        try {
             user user = userDao.checkLogin(Kayttajanimi, Salasana);
            String destPage = "jsp/login.jsp";
             
            if (user != null) {
                HttpSession session = request.getSession();
                session.setAttribute("user", user);
                destPage = "jsp/home.jsp";
            } else {
                String message = "Invalid email/password";
                request.setAttribute("message", message);
            }
             
            RequestDispatcher dispatcher = request.getRequestDispatcher(destPage);
            dispatcher.forward(request, response);
             
        } catch (SQLException | ClassNotFoundException ex) {
            throw new ServletException(ex);
        }
    }
}