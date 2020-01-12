package User;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * Servlet implementation class login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	Session se;
	Transaction tx;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		se = HibernateUtil.getSessionFactory().openSession();
		tx = se.beginTransaction();

		String uname = request.getParameter("uname");

		String password = request.getParameter("pass");

		// pw.print("asdsad");
		
		Query query = se.createQuery("from StudentPojo where username='" + uname + "' and PASSWORD='" + password + "'");
		
		if (!(query.list().isEmpty())) {
			List<?> list = query.list();
			request.setAttribute("list", list);
			RequestDispatcher rd = request.getRequestDispatcher("Welcome.jsp");
			rd.forward(request, response);
			// doGet(request, response);

			System.out.println(list);
		}
		else {
			RequestDispatcher rd = request.getRequestDispatcher("Failure.jsp");
			rd.forward(request, response);
		}
			
	}

}
