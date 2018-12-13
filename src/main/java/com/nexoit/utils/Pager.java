package com.nexoit.utils;

import com.nexoit.pojo.User;

import java.util.ArrayList;
import java.util.List;

public class Pager {


    private int pageSize = 10;            //页大小
    private int pageIndex = 0;           //当前页号
    private int totalPageCount = 0;      //总页数
    private int record = 0;              //记录总数
    private Integer nextPage;          //下一页
    private Integer prePage;           //上一页
    private List<User> userList = new ArrayList<>();     //用户信息的集合


    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    //得到开始记录数
    public int getSartRow() {
        return (pageIndex - 1) * pageSize;
    }

    //得到结束记录数
    public int getEndRow() {
        return pageSize;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageIndex() {
        return pageIndex;
    }

    //得到当前页
    public void setPageIndex(int pageIndex) {
        this.pageIndex = pageIndex;
        //下一页
        setNextPage();
        //上一页
        setPrePage();
    }

    public int getTotalPageCount() {
        return totalPageCount;
    }

    //总页数
    public void setTotalPageCount() {
        int totalP = record % getPageSize() == 0 ? record / getPageSize() :
                record / getPageSize() + 1;
        this.totalPageCount = totalP;
    }

    public int getRecord() {
        return record;
    }

    //总记录数
    public void setRecord(int record) {
        this.record = record;
        //设置总页数
        setTotalPageCount();
    }

    public Integer getNextPage() {
        return nextPage;
    }

    //设置下一页
    public void setNextPage() {
        this.nextPage = this.pageIndex + 1;

    }

    public Integer getPrePage() {
        return prePage;
    }

    //设置上一页
    public void setPrePage() {
        this.prePage = this.pageIndex - 1;
        if (this.prePage < 1) {
            this.prePage = 1;
        }


    }
}
