import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/add")
public class one extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		 int i = Integer.parseInt(req.getParameter("num1"));
		 int j = Integer.parseInt(req.getParameter("num2"));
		 int sum = i+j;
		 
//		 req.setAttribute("sum", sum);
//		 
//		 RequestDispatcher rd = req.getRequestDispatcher("sq");
//		 rd.forward(req, resp);
	}
}
