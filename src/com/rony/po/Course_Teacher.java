package com.rony.po;

public class Course_Teacher extends Course {
    private String name;

    public Course_Teacher() {
    }

    public Course_Teacher(int id, String courseName, int teacherID, String courseTime, String classRoom, int courseWeek, String courseType, float score, String name) {
        super(id, courseName, teacherID, courseTime, classRoom, courseWeek, courseType, score);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return super.toString()+"Course_Teacher{" +
                "name='" + name + '\'' +
                '}';
    }
}
