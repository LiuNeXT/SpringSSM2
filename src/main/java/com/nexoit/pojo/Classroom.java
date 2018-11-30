package com.nexoit.pojo;

import java.util.List;

public class Classroom {

    private Integer classId;

    private String classRoomName;


    private List<User> student;

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public String getClassRoomName() {
        return classRoomName;
    }

    public void setClassRoomName(String classRoomName) {
        this.classRoomName = classRoomName;
    }

    public List<User> getStudent() {
        return student;
    }

    public void setStudent(List<User> student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Classroom{" +
                "classId=" + classId +
                ", classRoomName='" + classRoomName + '\'' +
                ", student=" + student +
                '}';
    }
}
