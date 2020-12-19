package com.security.project.dao;

import java.util.List;

import com.security.project.dto.UserDto;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UserDao {
    
    List<UserDto> selectUser();
}
