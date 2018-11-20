package com.nexoit.service.impl;

import com.nexoit.mapper.UserMapper;
import com.nexoit.pojo.User;
import com.nexoit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getUserList() throws Exception {
        return  userMapper.getUserList();
    }
}
