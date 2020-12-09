package com.allen;

public class Student implements Person {

    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void giveMoney() {
        // 数钱时间
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name + "上交班费50元");
    }

    @Override
    public void registerName() {
        // 花两秒登记姓名
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(name + "登记姓名结束...");
    }
}
