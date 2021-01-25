package exam.spring.board.controller.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import exam.spring.board.dto.Member;
import exam.spring.board.service.MemberService;

@RestController
@RequestMapping(path = "/api/members")
public class MembersAPIController {
	@Autowired
	private MemberService memberService;
	
	@GetMapping
	public List<Member> getMembers(){
		return memberService.getMembers();
	}
	@PostMapping
	public void addMember(@RequestBody Member member) {
		memberService.memberJoin(member);
	}
	@GetMapping("/{id}")
	public Member getMember(@PathVariable(name="id")String id) {
			return memberService.getMember(id);	
	}
	@DeleteMapping("/{id}")
	public void deleteMember(@PathVariable(name="id")String id) {
		memberService.deleteMember(id);
	}
	@PutMapping
	public void updateMember(@RequestBody Member member) {
		memberService.updateMember(member);
	}
}
