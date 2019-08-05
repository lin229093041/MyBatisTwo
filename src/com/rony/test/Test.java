package com.rony.test;

import com.rony.po.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Test {
    public static void main(String[] args) throws IOException {
        InputStream is= Resources.getResourceAsStream("mybatis.xml");
        SqlSession session= new SqlSessionFactoryBuilder().build(is).openSession();
//        User u=session.selectOne("test.selectUser",1);
        User u=new User(3,"小李",19,"123456");
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
        List<Object> list = session.selectList("test.selectRename");
        System.out.println(list);
    }

    public void test(){

    }
}
