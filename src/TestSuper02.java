public class TestSuper02 {
    public static void main(String[] args) {
        System.out.println("开始创建一个ChildClass对象......");
        new ChildClass();

    }
    static class FatherClass{
        int value;

        public FatherClass(){
            value=100;
            System.out.println("创建FatherClass"+value);

        }
    }
    static class ChildClass extends FatherClass {
        public ChildClass(){

            System.out.println("创建ChlidClass");
        }
    }
}
