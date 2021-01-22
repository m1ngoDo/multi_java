package exam.spring.board.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import exam.spring.board.dao.BoardMapper;
import exam.spring.board.dto.Board;

@Service
public class BoardService {
	@Autowired
	private BoardMapper boardMapper;
	
	public Board getBoard(Integer id) {
		return boardMapper.getBoard(id);
	}
}
