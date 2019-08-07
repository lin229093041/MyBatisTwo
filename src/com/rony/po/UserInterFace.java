package com.rony.po;

public class UserInterFace {
    private int id;
    private  String passWord;
    private int role;

    public UserInterFace() {
    }

    public UserInterFace(int id, String passWord, int role) {
        this.id = id;
        this.passWord = passWord;
        this.role = role;
    }

    @Override
    public String toString() {
        return "UserInterFace{" +
                "id=" + id +
                ", passWord='" + passWord + '\'' +
                ", role=" + role +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }
}
