package com.itbaizhan;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestLinkedList {
    public static void main(String[] args) {
        List<String> list=new LinkedList<>();
        //添加元素
        boolean a = list.add("a");
        boolean b = list.add("b");
        boolean c = list.add("c");
        list.add(3,"a");
        System.out.println(a+"\t"+b+"\t"+c+"\t");
        //获取容器中的所有元素
        for (String i:list){
            System.out.println(i);
        }
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
