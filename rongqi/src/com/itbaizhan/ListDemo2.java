package com.itbaizhan;

import java.util.ArrayList;
import java.util.List;

public class ListDemo2 {
    public static void main(String[] args) {
        List<Integer>list=new ArrayList<>();
        while (true) {
            //产生随机数
            int num = (int) (Math.random() * 10 + 1);
            //判断当前元素在容器中是否存在
            if (!list.contains(num)) {
                list.add(num);
            }
            if (list.size() == 10) {
                break;
            }
        }
            for (Integer i:list)
            {
                System.out.println(i);
            }

    }
}
