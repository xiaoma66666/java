package com.itbaizhan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestArrayList2 {
    public static void main(String[] args) {
        //实例化ArrayList容器
        List<String> list=new ArrayList<>();
        //添加元素
        list.add("oldlu");
        list.add("itbz");
        //向指定位置添加元素
        list.add(0,"sxt");
        Object[]objects=list.toArray();
        System.out.println(Arrays.toString(objects));
        System.out.println("获取元素");
        String s = list.get(1);
        System.out.println(s);

        System.out.println("获取所以元素方式一");
        //使用普通for循环
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        System.out.println("方式2");
        for (String s1:list){
            System.out.println(s1);
        }

        System.out.println("元素替换");
        String kevin = list.set(1, "kevin");
        System.out.println(kevin);

        System.out.println("根据索引位置删除元素");
        String remove =list.remove(1);
        System.out.println(remove);
        System.out.println("查找元素在容器中第一次出现的位置");
        int sxt = list.indexOf("sxt");
        System.out.println(sxt);
        System.out.println("查找元素在容器中最后一次出现的位置");
        list.add("sxt");
        int sxt1 = list.lastIndexOf("sxt");
        System.out.println(sxt1);
    }
}
