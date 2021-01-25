package exam.spring.board.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

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
	public String memberJoin(@ModelAttribute Member member,HttpServletRequest request) {
		System.out.println(member);

			memberService.memberJoin(member);

		return "redirect:/hello";
	}
	@GetMapping
	public String getMembers(ModelMap model) {
		model.addAttribute("list",memberService.getMembers());
		return "member/list";
	}
	@GetMapping("/{id}")
	public String getMember(@PathVariable(name="id") String id, ModelMap model) {
		Member member = memberService.getMember(id);
		model.addAttribute("member", member);
		return "member/view";
	}
	
}
