package jigyasa;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

public class DisplayAccountDetailsServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		int id = Integer.parseInt(request.getParameter("id"));
		try {

			JdbcTemplate jt = SpringJDBCTemplate.getTemplate();
			SqlRowSet rs = jt.queryForRowSet("SELECT * FROM Hotel WHERE RoomNo=" + id);
			out.println("<html><body bgcolor=#ffffcc text=olive>");
			out.println("<h1><center>Booking information</h1><hr><br><h3>");
			if (rs.next()) {
				out.println("<form action='/JdbcTemplate_Hotel/updateaction'>");
				out.println("Room No. :<input type=text name=t1 value='" + rs.getString(1) + "' readonly><br><br>");
				out.println(" Name :<input type=text name=t2 value='" + rs.getString(2) + "' readonly><br><br>");
				out.println("rate :<input type=text name=t3 value='" + rs.getString(3) + "' ><br><br>");
				out.println("<input type=submit value='Update Room'>");
				out.println("</form>");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}