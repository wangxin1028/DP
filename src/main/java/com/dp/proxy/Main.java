package com.dp.proxy;

import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) {
        //通过代理控制对方法的访问
        Person p = new Student();
        //自己的的代理
        Person own = (Person) Proxy.newProxyInstance(p.getClass().getClassLoader(), p.getClass().getInterfaces(), new OwnerHandler(p));
        own.setAge(5);
        int age = own.getAge();
        System.out.println(age);
        //own代理调用setScore方法抛出异常
        //own.setScore(100);
        Person other = (Person) Proxy.newProxyInstance(p.getClass().getClassLoader(), p.getClass().getInterfaces(), new OtherHandler(p));
        other.setScore(59);
        int score = other.getScore();
        System.out.println(score);
        other.setName("傻蛋");
    }
}
