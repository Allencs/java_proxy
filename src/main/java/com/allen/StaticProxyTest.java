package com.allen;

public class StaticProxyTest {

    public static void main(String[] args) {

        //被代理的学生张三，他的班费上交有代理对象monitor（班长）完成
        Person zhangSan = new Student("张三");

        // 生成代理对象（班长）
        StudentsProxy monitor = new StudentsProxy(zhangSan);

        // 由班长代理缴费
        monitor.giveMoney();

        // 由班长代理登记名称
        monitor.registerName();

    }
}
