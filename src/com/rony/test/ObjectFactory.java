package com.rony.test;

import org.apache.ibatis.reflection.factory.DefaultObjectFactory;

import java.util.List;

public class ObjectFactory extends DefaultObjectFactory {
    @Override
    public <T> T create(Class<T> type) {
        System.out.println("无参数构造方法");
        return super.create(type);
    }

    @Override
    public <T> T create(Class<T> type, List<Class<?>> constructorArgTypes, List<Object> constructorArgs) {
        System.out.println("带参数的构造方法");
        T t = super.create(type, constructorArgTypes, constructorArgs);
        if (com.rony.po.User.class.isAssignableFrom(type)){
            System.out.println("User类");
            System.out.println(t);
        }

        return t;
    }
}
