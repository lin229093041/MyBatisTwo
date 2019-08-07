package com.rony.dao;

import com.rony.po.UserInterFace;



public interface user_interface_mapper {

    public UserInterFace findUserByID(int id);
    public void deleteByID(int id);
    public void addUser(UserInterFace userInterFace);
}
