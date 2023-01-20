import java.util.Arrays;

public class TestTwoArray {
    public static void main(String[] args) {
        int[][] a=new int[3][];
        a[0]=new int[2];
        a[1]=new int[4];
        a[2]=new int[3];
        a[0][1]=2;
        System.out.println(Arrays.toString(a[1]));
        int[][]b={{123},{33,3},{73,4,2}};
        System.out.println(b[2][0]);
        int[][]c=new int[3][];
        c[0]=new int[]{1,2};
        c[1]=new int[]{1,4,5};
        System.out.println(c[1][1]);
        System.out.println(Arrays.toString(c[0]));
    }

}
