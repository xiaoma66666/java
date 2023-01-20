package com.itbaizhan.test;

public class TestExtends {
    public  void main(String[] args) {
        Student s=new Student("马晨",176,"java c");
        System.out.println(s);
        s.rest();
        s.Study2();
    }
     class Person{
        String name;
        int height;
        public void rest(){
            System.out.println("休息一会儿!");

        }

    }
    class  Student extends Person{
        String major;//专业

        public void Study2(){
            System.out.println("在尚学堂,学习java");

        }

        public  Student(String name, int height, String major) {
            //天然拥有父亲的属性
            this.name=name;
            this.height=height;
            this.major=major;
        }



    }
}
