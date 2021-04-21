package app;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
 
@WebServlet("/logout")
public class logout extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    public logout() {
        super();
    }
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
    	 HttpSession session = request.getSession(false);
         if (session != null) {
             session.invalidate();
             
             
         }
         String redirect = "http://localhost:8080/";
         response.sendRedirect(redirect);
		
    }
 
    
    
}