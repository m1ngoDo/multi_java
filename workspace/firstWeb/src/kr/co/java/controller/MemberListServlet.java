package kr.co.java.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.java.dao.MemberDAO;
import kr.co.java.dto.MemberDTO;

/**
 * Servlet implementation class MemberListServlet
 */
@WebServlet("/memberList")
public class MemberListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 로그인여부 확인하기!!!
		boolean loginFlag = false;
		String id = null;
		Cookie[] cookies = request.getCookies();
		if (cookies != null) {
			for (Cookie cookie : cookies) {
				if ("loginOk".equals(cookie.getName())) {
					loginFlag = true;
					id = cookie.getValue();
					break;
				}
			}
		}

		

		if (loginFlag) {
			// 로그인이 된 사용자라면... 리스트를 보여준다...

			// 1. DAO에게 memberList를 얻어온다.
			MemberDAO dao = new MemberDAO();
			List<MemberDTO> memberList = dao.getMemberList();
			// 2. 얻어온 memberList를 request객체에게 맡긴다.
			request.setAttribute("memberList", memberList);
			request.setAttribute("id", id);
			// 3. memberList.jsp로 포워딩한다.
			RequestDispatcher rd = request.getRequestDispatcher("memberList.jsp");
			rd.forward(request, response);
		}else {
			//// 로그인하지 않은 사용자에게는 리스트를 보여주지 않는다...
			response.sendRedirect("loginForm.jsp");
		}
	}

}
