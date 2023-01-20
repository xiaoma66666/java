
import java.util.Scanner;
public class Test100Ji {
    public static void main(String[] args) {
        Scanner  s=new Scanner(System.in);
        double w=Math.PI;
        int q=s.nextInt();
        String str=s.next();
        int i=1,sum=0,sun=0;
        for(; i<=q; i++)
            if(i%2==1)
            {
                sum+=i;
            }
        else {
            sun=sun+i;
            }
        i++;
        System.out.println("随机数是:"+w);
        System.out.println("字符串:"+str);
        System.out.println("这个数是:"+q);
     System.out.println("奇数和为:"+sum);
        System.out.println("偶数和为:"+sun);
}}
/*public class Test100Ji {
    public static void main(String[] args) {
        int i=1 ,sum=0,sun=0;
        while (i<=100){
            if(i%2==1){
                sum+=i;
            }
            else{
            sun=sun+i;
        }
            i++;

    }
        System.out.println("奇数和为:"+sum);
        System.out.println("偶数和为:"+sun);
}}*/
