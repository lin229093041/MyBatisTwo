package com.rony.po;

import java.util.List;

public class Teacher_C extends  Teacher {
    private List<Course> list;

    public Teacher_C() {
    }

    public Teacher_C(int id, String name, String sex, List<Course> list) {
        super(id, name, sex);
        this.list = list;
    }

    public List<Course> getList() {
        return list;
    }

    public void setList(List<Course> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return super.toString()+"Teacher_C{" +
                "list=" + list +
                '}'+"\t";

    }
}
