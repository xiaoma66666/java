public interface Moveable {
    void run();
}
class iii {
    public static void main(String[] args ) {
        Moveable moveable = new Moveable(){
            @Override
            public void run() {
                System.out.println("小狗狗向前跑");
            }
        };
        moveable.run();

        int age = Integer.parseInt("20L");
        System.out.println(age);
    }
}
