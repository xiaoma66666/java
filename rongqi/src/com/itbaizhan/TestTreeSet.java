package com.itbaizhan;

import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class TestTreeSet {
    public static void main(String[] args) {
        Set<Users>set=new TreeSet<>();

        Users u1=new Users("machen",18);
        Users u2=new Users("luyu",19);
        Users u3=new Users("java",19);
        //添加元素
        set.add(u1);
        set.add(u2);
        set.add(u3);
        //遍历
        for (Users i:set){
            System.out.println(i);
        }
    }
}
