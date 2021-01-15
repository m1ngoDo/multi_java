package kr.co.java.controller;

import java.io.IOException;
import java.net.URLEncoder;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.co.java.dao.MemberDAO;
import kr.co.java.dto.MemberDTO;

@WebServlet("/login")
public class LoginSerlvet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1. 아이디,비밀번호를 얻어온다. 
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		//2. DB에 클라이언트에서 보낸 정보와 일치하는 정보가 있는지.. 확인한다. 
		MemberDAO dao = new MemberDAO();
		MemberDTO member = dao.getMember(id);
		//3. 확인한 결과에 따라 코드를 작성한다. 
		if(member == null) {
			//3-3. 해당하는 아이디가 존재하지 않을 경우.. 
			// 회원가입폼으로 리다이렉트 한다.
			//없는 아이디라서 회원가입을 하라는 메시지를 보여주고 싶다..   (상태정보가 유지!! - 세션을 이용한다.) 
			//Session객체 얻어오기!!!  
			HttpSession session = request.getSession();
			
			session.setAttribute("msg", id+"는 존재하지 않는 아이디입니다. 회원가입하고 이용하세요^^");		
			
			
			response.sendRedirect("memberJoinForm.jsp");
		}else if(member != null && member.getPassword().equals(password)) {
		//3-1. 사용자가 입력한 정보와 동일한 정보가 있다면..  로그인 해준다. 
		//쿠키를 생성해서 응답에 보내준다. 
		//memberList로 포워딩한다. 
			Cookie cookie = new Cookie("loginOk", member.getId());
			cookie.setPath("/");
			cookie.setMaxAge(-1);
			response.addCookie(cookie);
			
			response.sendRedirect("memberList");
		}else {
		//3-2. 아이디는 있으나 비밀번호가 다를경우... 
		//로그인폼으로 리다이렉트한다. 
			String msg = URLEncoder.encode("비밀번호를 확인하세요.","utf-8");
			Cookie cookie = new Cookie("msg", msg);
			cookie.setPath("/");
			cookie.setMaxAge(3);
			response.addCookie(cookie);
			response.sendRedirect("loginForm.jsp");
		
		}
	}

}
