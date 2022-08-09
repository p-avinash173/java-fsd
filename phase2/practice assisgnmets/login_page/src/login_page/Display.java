package login_page;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/dis")
public class Display extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Display() {
        super();
    }
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out= resp.getWriter();
		resp.setContentType("text/html");
		
		String username= req.getParameter("uname");
		String password= req.getParameter("pass");
		out.println("Welcome "+ username+"!");
		out.println("<br>");
		out.println("Logged in Successfully ");
		out.println("<br>");
		out.println("Your Password is "+password);
		out.println("<br>");
		out.println("<a href='logout'>Logout</a>");
	}

}
