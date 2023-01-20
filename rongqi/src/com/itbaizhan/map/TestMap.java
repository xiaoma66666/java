package com.itbaizhan.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TestMap {
    public static void main(String[] args) {
        //实例化HashMap容器
        Map<String,String> map=new HashMap<>();
        //添加元素
        String put = map.put("a", "A");
        String put1 = map.put("b", "B");
        String put2 = map.put("c", "C");
        String put3 = map.put("a", "AA");
        System.out.println(put+"\t"+put1+"\t"+put2+"\t"+put3+"\t");
        System.out.println("-----------------------");
        //获取容器中元素的数量
        int size = map.size();
        System.out.println(size);
        System.out.println("--------------------------");

        //获取容器中的元素方式1
        String V= map.get("a");//必须知道value对应的key是什么
        System.out.println(V);
        //获取容器中的元素方式2
     Set<String> set = map.keySet();
        for (String k:set
             ) {
            System.out.println(k+"---------"+ map.get(k));

        }
        //获取容器中的元素方式3
        //Map.Entry就是一个键值对对象
        Set<Map.Entry<String,String>>entrySet=new HashSet<>();
        for (Map.Entry<String,String> entry:entrySet) {
            String Key = entry.getKey();
            String Value = entry.getValue();
            System.out.println(Key + "---------" + Value);
        }
            System.out.println("------------------");
            //Map容器的并集操作
            Map<String,String>map2=new HashMap<>();
            map2.put("f","F");
            map2.put("c","CC");
            map.putAll(map2);
            Set<String>key2=map.keySet();
            for (String key:key2){
                System.out.println("key:"+key+"value:"+map.get(key));
            }
            System.out.println("---------------");
            //删除元素
        String a = map.remove("a");
        System.out.println(a);
        System.out.println("-----------------");
        //判断key是否存在
        boolean a1 = map.containsKey("a");
        System.out.println(a1);
        System.out.println("-----------");


        //判断value是否存在
        boolean cc = map.containsValue("CC");
        System.out.println(cc);
    }


    }
