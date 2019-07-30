package ssm.mapper;

import java.util.List;

import ssm.dto.UserInfoDto;

public interface UserInfoMapper {
    
    public List<UserInfoDto> getUserInfo(long userId) ;
    
    public int add(UserInfoDto userInfoDto);

}
