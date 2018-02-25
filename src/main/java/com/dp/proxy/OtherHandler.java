package com.dp.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class OtherHandler implements InvocationHandler{
    private Person p;
    public OtherHandler(Person p){
        this.p = p;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if(method.getName().equals("setScore")){
            return method.invoke(p,args);
        }else if(method.getName().startsWith("set")){
            throw new IllegalAccessException("别人不能调用这些方法");
        }else{
            return method.invoke(p,args);
        }
    }
}
