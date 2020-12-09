package com.allen;

public class StudentsProxy implements Person{

    // 被代理的学生
    Student stu;

    // 只代理学生对象
    public StudentsProxy(Person stu){
        if (stu.getClass() == Student.class) {
            this.stu = (Student) stu;
        }
    }

    //代理上交班费，调班用被代理学生的上交费行为
    @Override
    public void giveMoney() {
        stu.giveMoney();
    }

    @Override
    public void registerName() {
        stu.registerName();
    }
}
