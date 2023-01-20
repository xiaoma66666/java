import java.util.Scanner;

public class ZuiDaGongYueShu {
    public static void main(String[] args) {

           Scanner sc=new Scanner(System.in);
           System.out.println("请输入第一个整数:");
           int a1= sc.nextInt();
           System.out.println("请输入第二个整数:");
           int a2=sc.nextInt();
       if (a1<0||a2<0){
           try {
               throw new Exception("不能输入负数");
           } catch (Exception e) {
               e.printStackTrace();
           }

       }
        int min;
        if (a2>a1){
            min=a1;
        }
        else{
            min=a2;
        }
        while (a1%min!=0||a2%min!=0){
            min--;
        }
        System.out.println(min);
    }

}
