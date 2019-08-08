package com.rony.test;

import com.rony.dao.user_interface_mapper;
import com.rony.po.UserInterFace;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


import java.io.IOException;
import java.io.InputStream;

public class Test {
    public static void main(String[] args) throws IOException {
        InputStream is= Resources.getResourceAsStream("mybatis.xml");
        SqlSession session= new SqlSessionFactoryBuilder().build(is).openSession();
        InputStream is2= Resources.getResourceAsStream("mybatis.xml");
        SqlSession session2= new SqlSessionFactoryBuilder().build(is2).openSession();
//        User u=session.selectOne("test.selectUser",1);
//        User u=new User(3,"小李",19,"123456");
//        int i = session.insert("test.insertUser", u);
//        System.out.println("小红id："+u.getId());

//        session.delete("test.deleteUser",4);
//        session.update("test.updateUser",u);
//        session.commit();
//        List<User> list=session.selectList("test.selectByName","r");
//        System.out.println(list);
//        UserQueryInfo info = new UserQueryInfo(u);
//        List list=session.selectList("test.QueryUser",2);
//        System.out.println(list);
//        session.selectM
//        List<Course_Teacher_Field> list = session.selectList("course_test.findC");
//        System.out.println(list);
//        for (Course_Teacher_Field ctf:list) {
//            System.out.println(ctf.getCourseName());
//            System.out.println("------------------------------------");
//            System.out.println(ctf.getT());
//        }
//        -----------------------------------------------

//        ---------------------------------------------------
//        Object o = session.selectList("course_test.findC");
//        System.out.println(o);
//        System.out.println("-------------------------------");
//        session.close();
//        session.commit();
//        is= Resources.getResourceAsStream("mybatis.xml");
//        session= new SqlSessionFactoryBuilder().build(is).openSession();

//        System.out.println(session2.selectList("course_test.findC").toString());
//        --------------------------------------------------------
        user_interface_mapper mapper = session.getMapper(user_interface_mapper.class);
        UserInterFace u = mapper.findUserByID(2);
        System.out.println(u);
        System.out.println("--------------------------------");
        user_interface_mapper mapper2 = session.getMapper(user_interface_mapper.class);
        UserInterFace u2 = mapper.findUserByID(2);
        System.out.println(u2);
    }


    public void test(){

    }
}
