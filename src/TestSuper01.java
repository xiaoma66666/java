public class TestSuper01 {
    public static void main(String[] args) {
        new ChildrenClass().f();
       new ChildrenClass().f2();
    }

    static class FatherClass{
        int value;
        void f() {
            value = 100;
            System.out.println("FatherClass.value" + value);
        }
    }
    static class ChildrenClass extends FatherClass{
        int value;
        int age;

        @Override
        void f() {
            super.f();
            value=200;

            System.out.println("ChildrenClass"+value);
            System.out.println(value);
            System.out.println(super.value);
        }
        public void f2(){
            age=18;
            System.out.println(age);
        }
    }
}
