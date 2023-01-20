package com.itbaizhan;

public class TestDefault {
    public static void main(String[] args) {
        A a=new Test_A();
        A.staticMethod();
        Test_A.staticMethod();
    }
}
interface A {
   public static void staticMethod(){
       System.out.println("A.staticMethod");
    }
}
class Test_A implements A{
   public static void   staticMethod(){
       System.out.println("Test_A.staticMethod");
   }
}
