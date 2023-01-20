package com.itbaizhan.Interface;

public interface Volont {
    int Fly_hight=100;
    void fly();
}
interface Honst{
    void helpOther();
}
class Angel implements Volont,Honst{
    @Override
    public void fly() {
        System.out.println("我是天使,飞起来了");
    }

    @Override
    public void helpOther() {
        System.out.println("扶老奶奶过马路");
    }
}
class GoodMan implements Honst{
    @Override
    public void helpOther(){
        System.out.println("扶老奶奶过马路");

    }
}
class BirdMan implements Volont{

    @Override
    public void fly() {
        System.out.println("我是鸟人,我在飞");
    }
}
