package com.nexoit.mapper;

import com.nexoit.pojo.User;

import java.util.List;

public interface UserMapper {

    //添加用户
    void addUser(User user) throws Exception;

    //查询所有用户
    List<User> getUserList() throws  Exception;

    //根据用户名查询用户
    User findUserByName(String username) throws Exception;

    //根据用户名模糊查找用户
    List<User> findUserListName(String username) throws Exception;

    //用户登录
    User findUserByUsernameAndPassword (User user) throws Exception;

    //通过主键找用户
    User findUserById (Integer uid) throws Exception;

}
