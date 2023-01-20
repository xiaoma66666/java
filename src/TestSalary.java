
import java.util.Scanner;




public class TestSalary {
    public static void main(String[] arge){
    Scanner s=new Scanner(System.in);
        System.out.println("**************我的薪水计算器*************");
        System.out.println("1输入88,退出程序");
        System.out.println("输入66,计算下一个年薪");
        while(true)
        {
            System.out.println("请输入月薪:");
            int monthSalary= s.nextInt();
            System.out.println("请输入月数:");
            int month=s.nextInt();
            int yearSalary=monthSalary*month;
            System.out.println("您的年薪为:"+yearSalary);
            if(yearSalary>=200000){
                System.out.println("恭喜你,超越98%的国人");
            }
                else if(yearSalary>=100000){
                System.out.println("恭喜你,超过90%的国人");

                }
            System.out.println("输入88,推出程序.\t输入66,继续下次计算");
                int count= s.nextInt();
                if (count==88){
                    System.out.println("程序退出");
                    break;
                }
                if (count==66){
                    System.out.println("下次计算开始");
                    continue;
                }
            }

        }


    }

