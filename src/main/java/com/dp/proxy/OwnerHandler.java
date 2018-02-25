package com.dp.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class OwnerHandler implements InvocationHandler{
    private Person p ;
    public OwnerHandler(Person p){
        this.p = p;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        if(method.getName().equals("setScore")){
            throw new IllegalAccessException("自己怎么能修改自己的分数呢");
        }else{
            return method.invoke(p,args);
        }
    }
}
