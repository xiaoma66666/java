import java.text.Format;
import java.util.Scanner;

public class XianGou {
    int weight1 =500;

    public static void main(String[] args) {
          double price =3.98/500;
        Scanner sc =new Scanner(System.in);
       double weight =sc.nextDouble();
        try{
            if (weight<=1500){
                System.out.println("应付款"+ String.format("%.2f",weight*price));
            }
            else {
                throw new Exception("每人限购1500克");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        sc.close();
    }
}
