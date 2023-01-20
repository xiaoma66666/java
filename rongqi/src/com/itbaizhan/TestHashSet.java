package com.itbaizhan;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TestHashSet {
    public static void main(String[] args) {
        //实例化HashSet容器
        Set<String>set=new HashSet<>();
        //添加元素
        boolean a = set.add("a");
        boolean b = set.add("b1");
        boolean c = set.add("c1");
        boolean a1 = set.add("a");
        System.out.println(a+"\t"+b+"\t"+c+"\t"+a1+"\t");
        //获取元素:在set接口类型的容器中,并没有提供获取指定位置的元素的方法
        for (String e:set){
            System.out.println(e);
        }
        System.out.println(set);
        System.out.println("----------------");
        set.remove("c1");
        System.out.println(c);
        for (String o:set){
            System.out.println(o);
        }
        System.out.println("----------------");
        int size= set.size();
        System.out.println(size);

    }
}
