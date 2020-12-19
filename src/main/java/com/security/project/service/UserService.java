package com.security.project.service;

import java.util.List;

import com.security.project.dao.UserDao;
import com.security.project.dto.UserDto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserService {
    
    @Autowired
    private UserDao userDao;

    public List<UserDto> selectUser() {
        return userDao.selectUser();
    }
}
