package com.allen;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class dynamicProxyTest {

    public static void main(String[] args) {

        //创建一个实例对象，这个对象是被代理的对象
        Person zhangSan = new Student("张三");

        //绑定InvocationHandler，增强被代理对象的方法
        InvocationHandler stuHandler = new StuInvocationHandler<Person>(zhangSan);

        Person monitor = (Person) Proxy.newProxyInstance(Person.class.getClassLoader(), new Class<?>[]{Person.class}, stuHandler);

        // 班长代缴班费
        monitor.giveMoney();
        // 由班长代理登记名称
        monitor.registerName();
    }
}
