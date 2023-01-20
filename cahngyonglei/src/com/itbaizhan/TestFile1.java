package com.itbaizhan;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;

//创建文件
public class TestFile1 {
    public static void main(String[] args) throws IOException {
        //使用File类访问文件或目录属性
        File f=new File("c:b.txt");
        f.createNewFile();
        System.out.println("File是否存在"+f.exists());
        System.out.println("File是否是目录"+f.isDirectory());
        System.out.println("File是否是文件"+f.isFile());
        System.out.println("File最后修改时间"+new Date(f.lastModified()));
        System.out.println("File的大小"+f.length());
        System.out.println("File的文件名"+f.getName());
        System.out.println("File的目录路径"+f.getAbsolutePath());
//使用mkdir/mkdirs创建目录
        File f2=new File("c:/c.txt");
        f.createNewFile();
        f.delete();
        File f3=new File("c:/电影/华语/大陆");
        f3.mkdirs();
        System.out.println(f3);








    }
}
