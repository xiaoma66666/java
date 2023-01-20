import java.util.Arrays;

public class YanHuiSanJiao {
    public static void main(String[] args) {
        //定义一个长度为10的二维数组
        int[][] Array_int=new int[10][];
        for (int i=0;i<10;i++) {//遍历行数
            Array_int[i] = new int[i + 1];//定义二维数组列数
            //遍历二维数组的列数
            for (int j = 0; j < Array_int[i].length; j++) {
                if (i <= 1) {//如果是数组的前两行
                    Array_int[i][j] = 1;//将其设置成1
                    continue;
                } else {
                    //如果是行首或行尾
                    if (j == 0 | j == Array_int[i].length - 1) {
                        Array_int[i][j] = 1;//将其值设置成1
                    } else {
                        //根据杨辉算法进行计算
                        Array_int[i][j] = Array_int[i - 1][j - 1] + Array_int[i - 1][j];
                    }
                }
            }
        }
            for (int i = 0; i < Array_int.length; i++) {
                for (int j = 0; j < Array_int[i].length; j++) {
                    System.out.print(Array_int[i][j] + "\t");
                }
                System.out.println();
            }
        }
        }
