package com.nexoit.service;

import com.nexoit.mapper.ClassroomMapper;
import com.nexoit.pojo.Classroom;
import com.nexoit.pojo.User;
import com.nexoit.service.impl.UserServiceImpl;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:spring/springmvc.xml", "classpath*:spring/applicationContext.xml"})
public class UserServiceTest {



    private final static Logger logger = LoggerFactory.getLogger(UserServiceTest.class);

    @Autowired
    private UserService userService;

    @Autowired
    private ClassroomMapper classroomMapper;

    @Test
    public void getUserList() throws Exception {
        List<User> userList = userService.getUserList();
        for (User u : userList) {
            System.out.println(u.toString());
        }
    }

    @Test
    public  void findUserByName() throws  Exception{
         User user = userService.findUserByName("fiona");
        System.out.println(user);
    }

    @Test
    public  void findUsernameAndPassword() throws Exception{
         User user = new User();
         user.setUsername("fiona");
         user.setPassword("1234");
         User user1 = userService.findUsernameAndPassword(user);
        System.out.println(user1);
    }

    @Test
    public void addUser() throws Exception{
        User user = new User(4,"Apple","131513512",29,"1","i@nexoit.cn");
            userService.addUser(user);
        System.out.println(user);

    }

    @Test
    public void deleteUser()throws Exception{
        userService.deleteUser(4);
    }


    @Test
    public void  getClassroom() throws Exception{
        Classroom classroom = new Classroom();
        classroom.setClassId(1);
        classroom.setClassRoomName("sd");
        System.out.println(classroom);
        classroomMapper.save(classroom);

        //Assert.assertNotNull(Arrays.asList(classroom).size());

    }
}