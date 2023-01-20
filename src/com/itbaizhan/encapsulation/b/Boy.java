package com.itbaizhan.encapsulation.b;

import com.itbaizhan.encapsulation.a.Person;

public class Boy extends Person{
    public  void boy(){
        Person p=new Person();
        System.out.println(p.testPublic);
        System.out.println(this.testProtected);


    }
}
