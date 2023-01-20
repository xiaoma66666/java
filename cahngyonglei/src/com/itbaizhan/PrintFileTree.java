package com.itbaizhan;

import java.io.File;

//打印目录树,递归结构
public class PrintFileTree {


    public static void main(String[] args) {
        File f=new File(System.getProperty("user.dir"));
     pintFile(f,0);
    }
    static void pintFile(File file, int level){

        for (int i = 0; i<level; i++){
            System.out.print("-");
        }
        //输出文件名
        System.out.println(file.getName());
        if(file.isDirectory()){
            File[] files=file.listFiles();
            for (File f:files){
                pintFile(f,level+1);
            }
        }

    }
}
