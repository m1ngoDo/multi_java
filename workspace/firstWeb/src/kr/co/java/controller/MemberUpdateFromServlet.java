package kr.co.java.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.java.dao.MemberDAO;
import kr.co.java.dto.MemberDTO;

@WebServlet("/MemberUpdateFromServlet")
public class MemberUpdateFromServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		
		MemberDAO dao = new MemberDAO();
		MemberDTO member = dao.getMember(id);
		
		if(member != null) {
			request.setAttribute("member", member);
			RequestDispatcher rd = request.getRequestDispatcher("memberUpdateForm.jsp");
			rd.forward(request, response);
		}else {
			response.sendRedirect("memberList");
		}
	}

}
