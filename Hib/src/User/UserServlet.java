package User;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;


@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Transaction tx;
	Session sess;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		StudentPojo pj = new StudentPojo();
		sess= HibernateUtil.getSessionFactory().openSession();
		tx=sess.beginTransaction();
		
		pj.setName(request.getParameter("name"));
		pj.setUsername(request.getParameter("usr"));
		pj.setPassword(request.getParameter("pwd"));
		pj.setGender(request.getParameter("gender"));
		pj.setAge(Integer.parseInt(request.getParameter("age")));
		
		sess.save(pj);
		tx.commit();
		
		response.sendRedirect("Login.jsp");
		
		
	}

}
