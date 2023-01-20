package com.itbaizhan;

public class MethodGeneric {
    public <T> void setName(T name){
        System.out.println(name);
    }
    public <T> void Method(T ...args){
        for (T t:args){
            System.out.println(t);
        }
    }
    public <T> T getAge (T age){
        return age;
    }

    public static void main(String[] args) {
        /*   MethodGeneric methodGeneric=new MethodGeneric();
        methodGeneric.setName("马成");
       Integer age= methodGeneric.getAge(18);
        System.out.println(age);*/
        MethodGeneric methodGeneric=new MethodGeneric();
        methodGeneric.Method("a","b","c");
        methodGeneric.Method(1,2,3,4,5);
    }
}
