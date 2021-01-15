package kr.co.java.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/TestServlet")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private int accessCount;
	
	
	@Override
	public void destroy() {
		
	}


	@Override
	public void init() throws ServletException {
		accessCount = 0;
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int localCount = 0; 
		synchronized (this) {
			accessCount++;
			localCount = accessCount;
		}
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		out.print("<i>This page has been accessed " + localCount + " times.</i>");
	}

	

}
