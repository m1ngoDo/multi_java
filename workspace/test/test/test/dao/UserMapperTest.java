package test.dao;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import test.config.ApplicationConfig;
import test.dto.Member;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {ApplicationConfig.class})
public class UserMapperTest {
	@Autowired
	UsersMapper userMapper;
	
	@Test
	public void getUser() throws Exception{
		Member member = userMapper.getUser("carami");
		Assert.assertNotNull(member);
		Assert.assertEquals("강경미", member.getName());
		
		
	}
	
}
