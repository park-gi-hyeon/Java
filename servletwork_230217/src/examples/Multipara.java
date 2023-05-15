package examples;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Multipara")
public class Multipara extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		String[] item;
//		getInitParameterValues 메소드 : 여러개 요청된 name 값들을 받는다.
		item = request.getParameterValues("item");
		out.println("선택된 항목이");
		for (int i = 0; i < item.length; i++) {
			out.println(" : "+item[i]);
		}
		out.println("입니다.");		
	}
}
