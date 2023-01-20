package com.itbaizhan;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class TestVector {
    public static void main(String[] args) {
        //实例化Vector
        Vector vector=new Vector();
        vector.add("a");
        vector.add("b");
        vector.add("c");
        vector.add("a");
        List<String> list=new ArrayList<>();
        list.add("a1");
        list.add("a3");
        
        for (String i:list){
            System.out.println(i);
        }
        for (Object e:vector){
            System.out.println(e);
        }
    }
}
