package com.itbaizhan;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//时间处理相关的类
public class TestDate {
    public static void main(String[] args) throws ParseException {
        //new出SimpleDateFormat对象
        SimpleDateFormat s1=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        SimpleDateFormat s2=new SimpleDateFormat("yyyy-MM-dd");
        //将时间转换成字符串
        String daytime=s1.format(new Date());
        System.out.println(daytime);
        System.out.println(s2.format(new Date()));
        System.out.println(new SimpleDateFormat("hh-mm-ss").format(new Date()));
        //将符合指定格式的字符串转换成时间对象,字符创格式需要和指定格式一致
        String time="2049-10-1";
        Date date=s2.parse(time);
        System.out.println(date);
        time="2049-10-1 20:15:30";
        date=s1.parse(time);
        System.out.println(date);
        SimpleDateFormat s3=new SimpleDateFormat("D");
        String daytime1=s3.format(new Date());
        System.out.println(daytime1);
    }
}

