package exam.spring.board.dao;

import org.apache.ibatis.annotations.Mapper;

import exam.spring.board.dto.Board;

@Mapper
public interface BoardMapper {
	public Board getBoard(int id);

	public void deleteBoard(Long id);

	public void updateBoard(Board board);

	public int addBoard(Board board);
}
