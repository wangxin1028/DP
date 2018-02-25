package com.dp.proxy;

public interface Person {
    public String getName();
    //设置方法只可以由自己调用
    public void setName(String name);
    public int getAge();
    //设置年龄方法只可以由自己调用
    public void setAge(int age);
    public int getScore();
    //设置分数方法只可以由别人调用,自己不能调用
    public void setScore(int score);
}
