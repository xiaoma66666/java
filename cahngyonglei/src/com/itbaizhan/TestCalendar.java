package com.itbaizhan;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class TestCalendar {
    //得到相关的日期元素
    public static void main(String[] args) {
        GregorianCalendar calendar =new GregorianCalendar(2049,9,1,22,10,50);
        int year=calendar.get(Calendar.YEAR);
    int month=calendar.get(Calendar.MONTH);
    int day=calendar.get(Calendar.DAY_OF_MONTH);
  //  int day2=calendar.get(Calendar.DATE);
    int date=calendar.get(Calendar.DAY_OF_WEEK);
        System.out.println(year);
        System.out.println(month);
        System.out.println(day);
        System.out.println(date);
        //设置日期
        GregorianCalendar calendar2=new GregorianCalendar();
        calendar2.set(Calendar.YEAR,2049);
        calendar2.set(Calendar.MONTH,9);

    }
}
