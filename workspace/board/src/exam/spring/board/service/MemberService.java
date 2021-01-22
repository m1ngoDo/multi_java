package exam.spring.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import exam.spring.board.dao.MembersMapper;
import exam.spring.board.dto.Member;

@Service
public class MemberService {
	@Autowired
	private MembersMapper membersMapper;
	
	public void memberJoin(Member member) {
		//회원가입을 위한 비지니스 로직이 있다면 여기서 구현!!! 
		//우리는 너무 간단한 예제라서 그냥 DB저장~
		
		int resultCount = membersMapper.addMember(member);
		System.out.println(resultCount);
	}
	
	public List<Member> getMembers(){
		return membersMapper.getMembers();
	}
	
	public Member getMember(String id) {
		return membersMapper.getMember(id);
	}
}
