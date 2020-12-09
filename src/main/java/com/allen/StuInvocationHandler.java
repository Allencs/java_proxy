package com.allen;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;


public class StuInvocationHandler<T> implements InvocationHandler {

    //invocationHandler持有的被代理对象
    T target;

    public StuInvocationHandler(T target) {
        this.target = target;
    }

    /**
     * proxy:代表动态代理对象
     * method：代表正在执行的方法
     * args：代表调用目标方法时传入的实参
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("代理执行方法：" + method.getName());

        //代理过程中插入监测方法,计算该方法耗时
        MonitorUtil.start();
        Object res = method.invoke(target, args);
        MonitorUtil.end(method.getName());
        return res;
    }
}
