package com.rony.po;

import java.io.Serializable;

public class Course_Teacher_Field extends Course implements Serializable {
    private Teacher t;

    public Course_Teacher_Field() {
    }

    public Course_Teacher_Field(Teacher t) {
        this.t = t;
    }

    public Course_Teacher_Field(int id, String courseName, int teacherID, String courseTime, String classRoom, int courseWeek, String courseType, float score, Teacher t) {
        super(id, courseName, teacherID, courseTime, classRoom, courseWeek, courseType, score);
        this.t = t;
    }

    public Teacher getT() {
        return t;
    }

    public void setT(Teacher t) {
        this.t = t;
    }

    @Override
    public String toString() {
        return super.toString()+"Course_Teacher_Field{" +
                "t=" + t +
                '}';
    }
}
