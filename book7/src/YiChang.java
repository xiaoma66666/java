
import java.util.Scanner;

public class YiChang {



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        boolean flag=true;
while(flag){

            try{
                System.out.println("请输入姓名:");
                String s1=sc.nextLine();
                System.out.println("请输入年龄");
                int s2=Integer.parseInt(sc.nextLine());
                System.out.println("姓名:"+s1+"   年龄:"+s2);
                flag=false;

            }catch (NumberFormatException e){
                e.printStackTrace();
                System.err.println("请重新输入");
            }
            finally {
                sc.reset();
            }

        }

    }
}
