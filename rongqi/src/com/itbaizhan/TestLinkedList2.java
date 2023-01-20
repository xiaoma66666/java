package com.itbaizhan;

import java.util.LinkedList;
import java.util.List;

public class TestLinkedList2 {
    public static void main(String[] args) {
        //实例化LinkedList容器
        LinkedList<String>list=new LinkedList<>();
        //将指定元素插入到开头
        list.addFirst("a");
        list.addFirst("b");
        list.addFirst("c");
        for (String i:list){
            System.out.println(i);
        }
        System.out.println("---------------------------------");
        LinkedList<String>list2=new LinkedList<>();
        list2.addLast("a");
        list2.addLast("b");
        list2.addLast("c");
        for (String e:list2){
            System.out.println(e);
        }
        System.out.println("-------------------------------------");
        //返回此链表的第一个元素
        System.out.println(list2.getFirst());
        //返回此链表的最后一个元素
        System.out.println(list2.getLast());
        System.out.println("---------------------------------");
        //移除此链表中的第一个元素,并返回这个元素
      /*  String s = list2.removeFirst();*/
        System.out.println(list2.pop()+"s");
        //移除此链表的最后一个元素,并返回这个元素
        String s1 = list2.removeLast();
        System.out.println(s1);
        for (String o:list2){
            System.out.println(o);
        }
        System.out.println("----------------------------");
        //从此链表所表示的堆栈处弹出一个元素,等效于removeFirst

    }
}
