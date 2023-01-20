public class Outer2 {
    private int a=10;
    private static  int b=20;
    static class Inner2{
        public void test(){
            System.out.println(b);
        }
    }

}
class TestOuter2{
    public static void main(String[] args) {
        Outer2.Inner2 c=new Outer2.Inner2();
        c.test();
    }
}

