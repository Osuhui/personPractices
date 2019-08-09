package ssm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ssm.dto.UserInfoDto;
import ssm.service.UserInfoService;

@Controller
@RequestMapping("")
public class UserInfoController {

	@Autowired
	UserInfoService userInfoService;
	
	@RequestMapping("listUserInfo")
	public ModelAndView listUserInfo( ) {
		
		ModelAndView mav = new ModelAndView();
		List<UserInfoDto> userInfolist = userInfoService.getUserInfo();
		
		mav.addObject("userInfolist", userInfolist);
		
		mav.setViewName("listUserInfo");
		return mav;
		
	}

}
