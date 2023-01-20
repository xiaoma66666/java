package com.itbaizhan;

import javax.imageio.stream.ImageInputStream;

public class TestInteger {
    void Testinteger(){
    //基本数据类型转换成Integer对象
    Integer j=Integer.valueOf(10);
    //integer对象转换为基本数据类型
    int a=j.intValue();
    //字符串转化成integer对象
    Integer int3=Integer.parseInt("334");

    //integer对象转化成字符串
    String str1=int3.toString();
    //一些常见int类型相关的常量
        System.out.println("int能表示的最大数是:"+Integer.MAX_VALUE);
        System.out.println("int能表示的最小数是:"+Integer.MIN_VALUE);
        System.out.println(a);
        //测试自动装箱
        Integer x=100;//相当于Integer x=Integer.valueof(100);这是自动装箱
        int y=x;//相当于 int y=x.intvalue();//这是自动拆箱
        //测试缓存问题
        Integer x1=100;
        Integer x2=100;
        Integer x3=1000;
        Integer x4=1000;
        int x5=100;
        int x6=100;
        System.out.println(x5==x1);
        System.out.println(x1.equals(x5));
        System.out.println(x1==x2);
        System.out.println(x3==x4);
        System.out.println(x1.equals(x2));
        System.out.println(x3.equals(x4));

    }

    public static void main(String[] args) {
        TestInteger test=new TestInteger();
        test.Testinteger();
    }
}
