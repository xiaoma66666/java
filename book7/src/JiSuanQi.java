import java.util.InputMismatchException;
import java.util.Scanner;

public class JiSuanQi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try {

            System.out.println("请输入第一个整数");
            int num1= sc.nextInt();
            System.out.println("请输入运算符号");
            String f= sc.next();
            System.out.println("请输入第二个整数");
            int num2= sc.nextInt();
            int result=0;
            switch (f){
                case "+":result=num1+num2;break;
                case "-":result=num1-num2;break;
                case "*":result=num1*num2;break;
                case "/":if (num2!=0)
                    result=num1/num2;
                else System.out.println("除数不可能是0");
                break;
            }
            System.out.println("运算结果"+result);


        }catch (InputMismatchException i){
            System.out.println("对不起你输入的不是整数"+i.toString());
        }
    sc.close();
    }

}
