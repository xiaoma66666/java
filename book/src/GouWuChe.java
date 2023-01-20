import java.util.Scanner;

public class GouWuChe {
    Scanner sc=new Scanner(System.in);


    public void pay(int shuLian,double price){
        System.out.println("应付"+price+"元");
    }
    public void pay(int shuLian,double price,double zhe){
        System.out.println("应付"+price*shuLian*zhe+"元");
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int shuLian=sc.nextInt();
        double price=580;
        double zhe=0.8;
        GouWuChe gouWuChe=new GouWuChe();
        if (shuLian==1){
            gouWuChe.pay(shuLian,price);
        }
        else {
            gouWuChe.pay(shuLian,price,zhe);
        }
    }
}
