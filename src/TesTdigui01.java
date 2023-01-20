/*public class TesTdigui01 {
    public static void main(String[] args) {
        long kaiShiTime=System.currentTimeMillis();
        int relst=digui(5);
        long endtTime=System.currentTimeMillis();
        System.out.println(relst);
        System.out.println("程序运行时间"+(endtTime-kaiShiTime));
    }

    public static int digui(int n){
        if(n==1)
            return 1;
        else{
            return n*digui(n-1);

        }

    }
}
*/
public class TesTdigui01 {
    public static void main(String[] args) {
        int a=1,b=1,sum=0;
        for(;a<=5;a++){
            b=b*a;

        }
        System.out.println("5的阶乘为:"+b);
    }
}