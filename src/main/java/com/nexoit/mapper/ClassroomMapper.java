package com.nexoit.mapper;

import com.nexoit.pojo.Classroom;
import com.nexoit.pojo.School;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClassroomMapper extends JpaRepository<Classroom,Integer> {


    Page<School> getAll() throws Exception;



}
