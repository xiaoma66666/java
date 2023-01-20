package com.itbaizhan.encapsulation.a;

public class Student extends Person{
    public void student(){
Person p=new Person();
        System.out.println(super.testProtected);
        System.out.println(p.testDefault);
        System.out.println(p.testProtected);
        System.out.println(p.testPublic);
    }
}
