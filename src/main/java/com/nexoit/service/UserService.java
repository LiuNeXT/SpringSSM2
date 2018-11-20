package com.nexoit.service;

import com.nexoit.pojo.User;

import java.util.List;


public interface UserService {



    //查询所有用户
     List<User> getUserList() throws Exception;


}
