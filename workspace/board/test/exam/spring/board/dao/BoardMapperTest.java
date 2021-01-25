package exam.spring.board.dao;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import exam.spring.board.config.ApplicationConfig;
import exam.spring.board.dto.Board;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { ApplicationConfig.class })
public class BoardMapperTest {
	@Autowired
	private BoardMapper boardMapper;

	@Test
	public void getBoard() throws Exception {
		Assert.assertNotNull(boardMapper.getBoard(1));
		System.out.println(boardMapper.getBoard(1));
	}

	@Test
	public void addBoard() throws Exception {
		Board board = new Board();
		board.setContent("hello content");
		board.setReadCount(0);
		board.setTitle("hello");
		board.setMemberId("carami");
		int id = boardMapper.addBoard(board);
		System.out.println(id);
		System.out.println(board); // id에 자동으로 값이 들어가 있다.
	}

}
