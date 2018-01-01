package jigyasa;


import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import org.springframework.jdbc.core.*;

public class UpdateBankAccountServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int no = Integer.parseInt(request.getParameter("t1"));
		double rate = Double.parseDouble(request.getParameter("t3"));
		try {
			JdbcTemplate jt = SpringJDBCTemplate.getTemplate();
			jt.update("UPDATE Hotel SET RoomNo=? WHERE Rate=?", new Object[] {  new Integer(no),new Double(rate)});
		} catch (Exception e) {
			System.out.println(e);
		}
		RequestDispatcher rd = request.getRequestDispatcher("transaction.jsp");
		rd.forward(request, response);
	}
}