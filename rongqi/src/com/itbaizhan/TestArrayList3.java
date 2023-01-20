package com.itbaizhan;

import java.util.ArrayList;
import java.util.Arrays;

public class TestArrayList3 {
    public static void main(String[] args) {
        ArrayList list1=new ArrayList();
        list1.add("a");
        list1.add("b");
        list1.add("c");
        ArrayList list2=new ArrayList();
        list2.add("a");
        list2.add("b");
        list2.add("c");
//并集操作:保留不同的,删除相同的
        list1.addAll(list2);
        for (Object e:list1){
            System.out.println(e);
        }
        System.out.println("------------------");
        //交集操作:将另一个容器中的元素添加到当前容器中
        ArrayList list3=new ArrayList();
        list3.add("a");
        list3.add("b");
        list3.add("c");
        ArrayList list4=new ArrayList();
        list4.add("a");
        list4.add("d");
        list4.add("e");
        list3.retainAll(list4);
        for (Object i:list3){
            System.out.println(i);
        }
        System.out.println("---------------------");
        //差集操作:保留不同的,删除相同的;
        ArrayList list5=new ArrayList();
        list5.add("a");
        list5.add("b");
        list5.add("c");
        ArrayList list6=new ArrayList();
        list6.add("b");
        list6.add("c");
        list6.add("d");
        list5.removeAll(list6);
        for (Object q:list5){
            System.out.println(q);
        }
    }

}
