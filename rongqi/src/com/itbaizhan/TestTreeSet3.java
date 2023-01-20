package com.itbaizhan;

import java.util.Set;
import java.util.TreeSet;

public class TestTreeSet3 {

    public static void main(String[] args) {
        //在创建TreeSet容器需要给定比较器对象
        Set<Student> set = new TreeSet<>(new StudentComparator());
        //创建Student对象
        Student s = new Student("oldlu", 18);
        Student s1 = new Student("sxt", 22);
        Student s2 = new Student("admin", 22);
        //添加元素
        set.add(s);
        set.add(s1);
        set.add(s2);
        //遍历
        for (Student o:set
             ) {
            System.out.println(o);

        }
    }
}
