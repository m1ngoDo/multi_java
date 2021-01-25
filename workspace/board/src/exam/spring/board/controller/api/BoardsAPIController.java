package exam.spring.board.controller.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import exam.spring.board.dto.Board;
import exam.spring.board.service.BoardService;

@RestController
@RequestMapping(path = "/api/boards")
public class BoardsAPIController {
	@Autowired
	private BoardService boardService;
	
	@GetMapping("/{id}")
	public Board getBoard(@PathVariable(name="id")int id) {
		return boardService.getBoard(id);
	}
	
	@PostMapping
	public void addBoard(@RequestBody Board board) {
		boardService.addBoard(board);
	}
}
