import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/sq")
public class two extends HttpServlet{
 @Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	 int val = (int) req.getAttribute("sum");
	 int square = val*val;
	 
	 PrintWriter out = resp.getWriter();
	 out.print("<html><body bgcolor='Yellow' > </br>");
	 out.println("Sum of 2 numbers is : " + val );
	 out.println("Square of " + val + " is : " + square);
	 out.print("</body> </html>");
	 
	 
			 

 }
}
