package dev.scheincomp.jsp.user;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    public List<UserVO> getAllUser();
    public UserVO findUserByNickname(String nickname);

}
