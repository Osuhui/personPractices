package ssm.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import ssm.dto.UserInfoDto;
import ssm.mapper.UserInfoMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class MybatisTest {

	@Autowired
	private UserInfoMapper userInfomapper;

	@Test
	public void testAdd() {
		System.out.println(userInfomapper);
		UserInfoDto userInfoDto = new UserInfoDto();
		userInfoDto.setUserName("new Category");
		userInfomapper.add(userInfoDto);
	}

	@Test
	public void testGetUserInfo() {
		List<UserInfoDto> uidList=userInfomapper.getUserInfo();
		for (UserInfoDto uid : uidList) {
			System.out.println("useName : " + uid.getUserName());
		}
	}

}
