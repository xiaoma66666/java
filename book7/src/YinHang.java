import java.util.InputMismatchException;
import java.util.Scanner;

public class YinHang {
  static   double yu=1023.79;

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        try {
            System.out.println("请输入取款金额:");
            int qu= sc.nextInt();
            double yu2=yu-qu;
            if (yu2<0){
                System.out.println("取款失败,余额不足!!!");
            }else {
                System.out.println("取款成功" + "已取出" + qu + "元,余额为" + yu2 + "元");
            }
        }
        catch (InputMismatchException e){
            System.out.println("发生数字格式转换异常：输入的“取款金额”不是整数！");
        }
    }
}
