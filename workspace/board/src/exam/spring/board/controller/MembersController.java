package exam.spring.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import exam.spring.board.dto.Member;
import exam.spring.board.service.MemberService;

@Controller
@RequestMapping(path = "/members")
public class MembersController {
	@Autowired
	private MemberService memberService;
	
	@GetMapping("/joinForm")
	public String joinForm() {
		return "member/joinForm";
	}
	@PostMapping("/join")
	public String memberJoin(Member member) {
		System.out.println(member);
		memberService.memberJoin(member);
		return "redirect:/hello";
	}
	@GetMapping
	public String getMembers(ModelMap model) {
		model.addAttribute("list",memberService.getMembers());
		return "member/list";
	}
}
