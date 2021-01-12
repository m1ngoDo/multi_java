package kr.co.java.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import kr.co.java.common.DBUtil;
import kr.co.java.dto.MemberDTO;

public class MemberDAO {
	// 입력
	public boolean addMember(MemberDTO member) {
		boolean resultFlag = false;
		// 1. 필요한 객체들을 선언..
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			// 3. DB접속
			conn = DBUtil.getConnection();

			// 4. 쿼리문 준비
			String sql = "insert into members(id,name,password,email,join_date) values(?,?,?,?,sysdate)";
			ps = conn.prepareStatement(sql);
			ps.setString(1, member.getId());
			ps.setString(2, member.getName());
			ps.setString(3, member.getPassword());
			ps.setString(4, member.getEmail());
			// 5. 실행.
			int count = ps.executeUpdate();
			if(count == 1)
				resultFlag = true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 2. 선언한 객체를 닫아주세요.
			DBUtil.close(conn, ps);
		}

		return resultFlag;
	}

	public static void main(String[] args) {
		MemberDAO dao = new MemberDAO();
		MemberDTO member = new MemberDTO();
		member.setId("carami");
		member.setName("강경미");
		member.setPassword("1111");
		member.setEmail("carami@nate.com");
		
		System.out.println(dao.addMember(member));
	}
}
