package com.nexoit.pojo;

import java.util.List;

public class School {

    private Integer sid;

    private String sname;

    private List<Classroom> sclassrooms;

    @Override
    public String toString() {
        return "School{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", sclassrooms=" + sclassrooms +
                '}';
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public List<Classroom> getSclassrooms() {
        return sclassrooms;
    }

    public void setSclassrooms(List<Classroom> sclassrooms) {
        this.sclassrooms = sclassrooms;
    }
}
