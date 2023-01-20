package com.itbaizhan.animal;

public class TestPolym {
    public static void main(String[] args) {
        Animal a1=new Dog();
        animalCry(a1);
        Animal a2=new Cat();
        animalCry(a2);


    }
    static void animalCry(Animal a){
        System.out.println("这里");
        a.shout();
    }
}
