public class TestLf02 {
    public static void main(String[] args){
        double r=(int)(Math.random()*2);
        double c=2*Math.PI*r;
        double s=Math.PI*r*r;

        System.out.println("半径是"+r);
        System.out.println("周长是"+c);
        System.out.println("面积是"+s);

        if (s>=c){
            System.out.println("面积大于等于周长");
        }
        else{
            System.out.println("面积小于周长");
        }
    }
}
