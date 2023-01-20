package com.itbaizhan;

import java.util.Arrays;

//自定义一个简单的包装类
public class MyInteger {
    private final int value;

    private static MyInteger[] cache;//缓存[-128~127]之间的数字
    private static  final  int Low=-128;
    private static  final  int High=127;

    @Override
    public String toString() {
        return value+"";
    }

    static {
        cache=new MyInteger[High-Low+1];
        for (int i=Low;i<=High;i++){
            cache[i-Low]=new MyInteger(i);
        }
        System.out.println(Arrays.toString(cache));
    }
    public MyInteger(int value){
        this.value=value;
    }

    public static MyInteger valueof(int value){
        if (value>=Low&&value<=High){
            return cache[value-Low];
        }
        return new MyInteger(value);
    }
    public int intvalue(){
        return value;
    }


    public static void main(String[] args) {
        MyInteger a=new MyInteger(10);
        MyInteger b=MyInteger.valueof(100);
        MyInteger b2=MyInteger.valueof(100);
        MyInteger b3=MyInteger.valueof(1000);
        MyInteger b4=MyInteger.valueof(1000);
        System.out.println(b==b2);
        System.out.println(b3==b4);
    }
}
