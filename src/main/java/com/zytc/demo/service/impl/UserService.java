package com.zytc.demo.service.impl;

import com.zytc.demo.entity.User;
import com.zytc.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User selectByName(String userName) {
        return userMapper.selectByName(userName);
    }

}
