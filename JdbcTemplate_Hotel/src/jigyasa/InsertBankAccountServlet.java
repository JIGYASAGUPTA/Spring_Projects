package jigyasa;


import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import org.springframework.jdbc.core.*;

public class InsertBankAccountServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int roomNo = Integer.parseInt(request.getParameter("t1"));
		String name = request.getParameter("t2");
		double rate = Double.parseDouble(request.getParameter("t3"));
		try {
			JdbcTemplate jt = SpringJDBCTemplate.getTemplate();
			jt.execute("insert into hotel values(" + roomNo + ",'" + name + "'," + rate + ")");
		} catch (Exception e) {
			System.out.println(e);
		}
		RequestDispatcher rd = request.getRequestDispatcher("/selectaction");
		rd.forward(request, response);
	}
}