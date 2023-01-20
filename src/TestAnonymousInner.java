public class TestAnonymousInner {

    public void test1(A a){
        a.run();

    }
    public static void main(String[] args){
        TestAnonymousInner arg=new TestAnonymousInner();
        arg.test1(new A() {
            @Override
            public void run() {
                System.out.println("这就是一个匿名内部类,不能调用,只能用一次");
            }
        });
    }
    interface A{
        void run();
    }
}
