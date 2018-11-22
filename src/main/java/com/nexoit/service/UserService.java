package com.nexoit.service;

import com.nexoit.pojo.User;

import java.util.List;


public interface UserService {


    //查询所有用户
    List<User> getUserList() throws Exception;

    //根据用户名查用户
    User findUserByName(String username) throws Exception;

    //用户登陆
    User findUsernameAndPassword(User user) throws Exception;

    //添加用户
    void addUser(User user) throws Exception;
}
