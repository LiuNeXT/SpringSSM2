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

    //查询全部用户
    @Override
    public List<User> getUserList() throws Exception {
        return  userMapper.getUserList();
    }

    //新增用户
    @Override
    public void addUser(User user) throws Exception {
        userMapper.addUser(user);
    }

    //用户登陆
    @Override
    public User findUsernameAndPassword(User user) throws Exception {
        return userMapper.findUsernameAndPassword(user);
    }

    //检验用户名
    @Override
    public User findUserByName(String username) throws Exception {
       return userMapper.findUserByName(username);
    }

    @Override
    public void deleteUser(Integer uid) throws Exception {
        userMapper.deleteUser(uid);

    }
}
