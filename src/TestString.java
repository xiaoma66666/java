public class TestString {
    static String a1="马晨";
    String a2="马晨";
    String a3=new String("马晨");

    public static void main(String[] args) {
        String a1="马晨";
        String a2="马晨";
        String a3=new String("马晨");



        System.out.println(a1==a2);
        System.out.println(a1==a3);
        System.out.println(a1.equals(a3));
        //a1和a3不是同一个对象;
        //a3在内存的堆heep中开辟了一个新的数组value[]来储存.
        //所以a1和a3不是同样一个对象
    }
}
