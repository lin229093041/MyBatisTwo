package com.rony.po;

public class Course {
    private int id;
    private String courseName;
    private int teacherID;
    private  String courseTime;
    private String classRoom;
    private int courseWeek;
    private String courseType;
    private float score;

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", courseName='" + courseName + '\'' +
                ", teacherID=" + teacherID +
                ", courseTime='" + courseTime + '\'' +
                ", classRoom='" + classRoom + '\'' +
                ", courseWeek=" + courseWeek +
                ", courseType='" + courseType + '\'' +
                ", score=" + score +
                '}';
    }

    public Course() {
    }

    public Course(int id, String courseName, int teacherID, String courseTime, String classRoom, int courseWeek, String courseType, float score) {
        this.id = id;
        this.courseName = courseName;
        this.teacherID = teacherID;
        this.courseTime = courseTime;
        this.classRoom = classRoom;
        this.courseWeek = courseWeek;
        this.courseType = courseType;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(int teacherID) {
        this.teacherID = teacherID;
    }

    public String getCourseTime() {
        return courseTime;
    }

    public void setCourseTime(String courseTime) {
        this.courseTime = courseTime;
    }

    public String getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(String classRoom) {
        this.classRoom = classRoom;
    }

    public int getCourseWeek() {
        return courseWeek;
    }

    public void setCourseWeek(int courseWeek) {
        this.courseWeek = courseWeek;
    }

    public String getCourseType() {
        return courseType;
    }

    public void setCourseType(String courseType) {
        this.courseType = courseType;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }
}
