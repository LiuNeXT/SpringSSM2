package com.nexoit.service.impl;

import com.nexoit.pojo.User;
import com.nexoit.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

import javax.swing.*;

import java.util.List;

import static org.junit.Assert.*;

public class UserServiceImplTest {

    @Autowired
    private UserService userService;

    @Test
    public void addUser() {
    }

    @Test
    public void getUserList() {
        try {
            List<User> userList = userService.getUserList();
            System.out.println(userList);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void findUserByName() {
    }

    @Test
    public void getUserListByName() {
    }

    @Test
    public void findUserByUsernameAndPassword() {
    }

    @Test
    public void findUserById() {
    }
}