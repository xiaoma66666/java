package com.itbaizhan.animal;

abstract public class Animal {
   abstract public void shout();

    }
class Dog extends Animal{
    public void shout(){
        System.out.println("汪汪汪");
    }
    public void seeDoor(){
        System.out.println("看门中");
    }
}
class Cat extends Animal{
    public void shout(){
        System.out.println("喵喵喵");
    }

}
