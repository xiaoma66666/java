package com.itbaizhan;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {

        List<Integer>list=new ArrayList<>();
        while(list.size()<10){
          int  v = (int) (Math.random() * 10 + 1);
            if (!list.contains(v)){
                list.add(v);
            }
        }
        for (int i=0;i<10;i++){
            System.out.println(list.get(i));
        }
    }
}
