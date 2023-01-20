import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
      char c[][]=new char[4][];
      c[0]=new char[]{'春', '眠', '不', '觉', '晓'};
      c[1]=new char[]{'处', '处', '闻', '啼', '鸟'};
      c[2]= new char[] { '夜', '来', '风', '语', '声' };
      c[3] = new char[] { '花', '落', '知', '多', '少' };
        System.out.println("横版");
        for (int i=0;i<4;i++){
            for (int j=0;j<5;j++){
                System.out.print(c[i][j]);
            }
            if (i%2==0){
                System.out.println(",");
            }
            else {
                System.out.println(".");
            }
        }
        System.out.println("竖版");
        for (int j=0;j<5;j++){
            for (int i=3;i>=0;i--){
                System.out.print(c[i][j]);
            }
            System.out.println();
        }
        System.out.println(". , . ,");

    }
}
