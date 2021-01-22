package exam.spring.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import exam.spring.board.service.BoardService;

@Controller
@RequestMapping("/boards")
public class BoardController {
	@Autowired
	private BoardService boardService;

	@GetMapping("/{id}")
	public String getBoard(@PathVariable("id") Integer id, ModelMap model) {

		model.addAttribute("board", boardService.getBoard(id));
		return "board/view";
	}
}
