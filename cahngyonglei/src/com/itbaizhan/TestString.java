package com.itbaizhan;
//测试字符串相关类
public class TestString {
    public static void main(String[] args) {
        String str = "abc";
        //StringBuilder sb=new StringBuilder("abc");
        //StringBuffer sb2=new StringBuffer("abc");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 7; i++) {
            sb.append((char) ('A' + i));//追加单个字符
        }
        System.out.println(sb.toString());//转换成String输出
        sb.append(",i can sing my abc");
        System.out.println(sb.toString());
        StringBuilder sb2=new StringBuilder("北京尚学堂");
        sb2.insert(0,"爱").insert(0,"我");//插入字符串
        System.out.println(sb2.toString());
        sb2.delete(0,2);//删除子字符串
        System.out.println(sb2);
        sb2.deleteCharAt(0).deleteCharAt(2);//删除某个字符
        System.out.println(sb2.charAt(0));
        System.out.println(sb2.reverse());
    }
}
