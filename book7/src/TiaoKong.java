import java.util.Scanner;

public class TiaoKong {
  static   Scanner sc=new Scanner(System.in);
  static double price=0;
    public void Tiao() throws Exception{

        if (price>7){
            throw new Exception("西红柿的单价不能超过7元");
        }
    }

    public static void main(String[] args) {
        System.out.println("今天的西红柿单价为:(单价格式为3.00)");
        price= sc.nextDouble();
        try {
            TiaoKong tiaoKong=new TiaoKong();
           tiaoKong.Tiao();
        }catch (RuntimeException e){
            throw new RuntimeException();

        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
