package com.itbaizhan;

public class TestString01 {
    public static void main(String[] args) {
        //使用String进行的字符串拼接
        String str="";
        Long num1=Runtime.getRuntime().freeMemory();//获取系统剩余内存空间
        Long time1=System.currentTimeMillis();//获取系统当前时间
        for(int i=0;i<5000;i++){
            str+=i;
        }
        Long num2=Runtime.getRuntime().freeMemory();
        Long time2=System.currentTimeMillis();
        System.out.println(num1=num2);
        System.out.println(time2-time1);
        //使用StringBuilder进行的字符串拼接
        Long num3=Runtime.getRuntime().freeMemory();
        Long time3=System.currentTimeMillis();
        StringBuilder str2=new StringBuilder();
        for (int i=0;i<5000;i++){
            str2.append(i);
        }
        Long num4=Runtime.getRuntime().freeMemory();
        Long time4=System.currentTimeMillis();
        System.out.println(num3-num4);
        System.out.println(time4-time3);

    }
}
