public class TestObject {
    String name;
    String pwd;

    @Override
    public String toString() {
        return "名字"+name+"密码"+pwd;
    }

    public static void main(String[] args) {
        TestObject t=new TestObject();
        System.out.println(t.toString());
        TestObject t2=new TestObject();
        System.out.println(t2.toString());
    }

}
