import java.util.Arrays;

public class TestTwoArray2 {
    public static void main(String[] args) {
        Object[][]a=new Object[3][];
        Object[] a1={1001,"高小齐",18,"讲师","2-14"};
        Object[] a2={1002,"高小其",19,"助教","10-10"};
        Object[] a3={1003,"高晓琪",20,"班主任","5-5"};
        a[0]=a1;
        a[1]=a2;
        a[2]=a3;
        System.out.println(Arrays.toString(a[0]));
        System.out.println(Arrays.toString(a[1]));
        System.out.println(Arrays.toString(a[2]));
        for (int i=0;i<a.length;i++)
        {
            for (int j=0;j<a[i].length;j++)
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
