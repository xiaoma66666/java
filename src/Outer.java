public class Outer {
    private  int age=10;
    public void show(){
        System.out.println(age);
    }
    class Inner{
        private int age=20;
        public void show(){
            System.out.println(age);
            System.out.println(Outer.this.age);
        }
    }
}
