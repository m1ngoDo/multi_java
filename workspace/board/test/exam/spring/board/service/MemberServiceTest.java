package exam.spring.board.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import exam.spring.board.config.ApplicationConfig;
import exam.spring.board.dto.Member;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { ApplicationConfig.class })
@Transactional
public class MemberServiceTest {
	@Autowired
	MemberService memberService;
	
	@Test
	public void memberJoin() throws Exception{
		Member testMember = new Member();
		testMember.setId("test8");
		testMember.setName("테스트55");
		testMember.setPassword("test55");
		testMember.setEmail("test@test.com");
		
		memberService.memberJoin(testMember);
		
	}

}
