package com.itbaizhan.encapsulation.a;

import java.security.PrivateKey;

public class Person {
    private     int testPrivate;//私有的,类内友好
                int testDefault;//包内友好
   protected    int testProtected;//包内友好,父子友好
     public     int testPublic;//全局友好
    public void test(){
        Person p=new Person();
        System.out.println(this.testPrivate);
        System.out.println(this.testDefault);
        System.out.println(this.testProtected);
        System.out.println(this.testPublic);
    }
}
