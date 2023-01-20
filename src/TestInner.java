import javax.print.attribute.standard.MediaSize;

public class TestInner {
    public static void main(String[] args) {
        Outer a=new Outer();
        a.show();
        Outer.Inner b=new Outer().new Inner();
        b.show();
    }
}
