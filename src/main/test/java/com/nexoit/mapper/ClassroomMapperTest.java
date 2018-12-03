package com.nexoit.mapper;

import com.nexoit.pojo.Classroom;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:spring/springmvc.xml", "classpath*:spring/applicationContext.xml"})

public class ClassroomMapperTest {

    @Autowired
    private ClassroomMapper classroomMapper;

    @Test
    public void getAll() {
        PageRequest request = new PageRequest(0,3);


    }
}