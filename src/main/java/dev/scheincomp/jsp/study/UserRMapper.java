package dev.scheincomp.jsp.study;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

public interface UserRMapper {

    public List<UserRVO> getAllUser();
    public UserRVO findUserByNickname(String nickname);

}
