import java.util.Arrays;
public class TestArray3 {
    public static void main(String[] args) {
        int[] a={1,8,6,3,5};
        int[] b=new int[6];
        System.arraycopy(a,2,b,2,3);
        System.out.println(Arrays.toString(b));//打印
        Arrays.sort(b);
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.binarySearch(b,3));
        Arrays.fill(b,2,5,10);
        System.out.println(Arrays.toString(b));
    }

}
