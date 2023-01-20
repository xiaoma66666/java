public class ex1 {
    double a,b;
    public static double jia(double a,double b){
        return a+b;
    }
    public static double jian(double a,double b) {
        return a - b;
    }
    public static double cheng(double a,double b){
            return a*b;
    }
    public static double chu(double a,double b) {
        return a / b;
    }

    public static void main(String[] args) {
        System.out.println("4.4+7.11="+ex1.jia(4.4,7.11));
        System.out.println("8.9-2.28="+ex1.jian(8.9,2.28));
        System.out.println("5.2*13.14="+ ex1.cheng(5.2,13.14));
        System.out.println("92/89="+ex1.chu(92,89));
    }
}
