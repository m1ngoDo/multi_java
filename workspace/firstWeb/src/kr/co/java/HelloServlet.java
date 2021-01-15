package kr.co.java;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hi")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public HelloServlet() {
    	System.out.println("HelloServlet 생성자 실행");
    }
	@Override
	public void destroy() {
		System.out.println("HelloServlet destroy 실행");
	}

	@Override
	public void init() throws ServletException {
		System.out.println("HelloServlet init 실행");
	}

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("HelloServlet service 실행");
		
		System.out.println(request.getParameter("name"));
		System.out.println("짹짹!!");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.print("<html><head><title>hello servlet~~~!!</title>");
		out.print("<body>");
		out.print("<h1>hahah servlet!!!</h1>");
		for(int i = 0; i < 10; i++) {
			out.print("안녕!!!"+request.getParameter("name")+"<br>");
		}
		out.print("</body></html>");
		out.close();
		
	}

}
