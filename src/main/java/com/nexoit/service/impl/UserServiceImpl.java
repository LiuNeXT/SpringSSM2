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
    public void addUser(User user) throws Exception {
        userMapper.addUser(user);
    }

    @Override
    public List<User> getUserList() throws Exception {
        return userMapper.getUserList();
    }

    @Override
    public User findUserByName(String username) throws Exception {
        return userMapper.findUserByName(username);
    }

    @Override
    public List<User> getUserListByName(String username) throws Exception {
        return userMapper.findUserListName(username);
    }

    @Override
    public User findUserByUsernameAndPassword(User user) throws Exception {
        return userMapper.findUserByUsernameAndPassword(user);
    }

    @Override
    public User findUserById(Integer uid) throws Exception {
        return userMapper.findUserById(uid);
    }
}
