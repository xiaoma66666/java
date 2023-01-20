package com.itbaizhan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class TestArrayList {
    //实例化ArrayList容器
   // ArrayList list=new ArrayList();//可调用的方法多
    //Collection list3=new ArrayList();
    public static void main(String[] args) {
        List<String>list2=new ArrayList<>();
        //添加元素

        boolean falg1 = list2.add("oldlu");
        boolean falg2 = list2.add("itbz");
        boolean falg3 = list2.add("sxt");
        boolean falg4 = list2.add("sxt");
        System.out.println(falg1+"\t"+falg2+"\t"+falg3+"\t"+falg4);

        //将ArrayList转换为数组
        Object[] objects=list2.toArray();
        System.out.println(Arrays.toString(objects));

        //删除元素
        boolean b = list2.remove("oldlu");
        System.out.println(b);
        //获取元素个数
        int s = list2.size();
        System.out.println(s);
        //判断容器是否是空
        boolean empty = list2.isEmpty();
        System.out.println(empty);
        //如何判断容器中是否包含指定元素
        boolean itbz = list2.contains("itbz");
        System.out.println(itbz);
        //如何清空容器
        list2.clear();
        Object[] objects1=list2.toArray();
        System.out.println(Arrays.toString(objects1));
    }



}
