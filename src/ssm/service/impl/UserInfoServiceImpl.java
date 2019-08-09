package ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ssm.dto.UserInfoDto;
import ssm.mapper.UserInfoMapper;
import ssm.service.UserInfoService;

@Service
public class UserInfoServiceImpl implements UserInfoService {

	@Autowired
	UserInfoMapper userInfoMapper;

	public List<UserInfoDto> getUserInfo() {
		return userInfoMapper.getUserInfo();
	}

}
