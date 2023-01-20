public abstract class ShuiGuo {
    abstract String name();
}
class People4{
    void eat(ShuiGuo a){
        System.out.println("吃了"+a.name());
    }

    public static void main(String[] args) {
        People4 people4=new People4();
        ShuiGuo shuiGuo= new ShuiGuo() {
            @Override
            String name() {
                return "苹果和香蕉";
            }
        };

        people4.eat(shuiGuo);
    }
}