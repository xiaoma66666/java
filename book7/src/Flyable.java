public interface Flyable {
    void fly();
}
abstract class Insect{
    int legs;

    public Insect(int legs) {
        this.legs = legs;
    }
    abstract void reproduce();
}
class CangYin extends Insect implements Flyable {
    public CangYin(int legs) {
        super(legs);
        System.out.println("苍蝇有"+legs+"条腿");
    }

    @Override
    void reproduce() {
        System.out.println("苍蝇的繁殖方式是产卵");
    }

    @Override
    public void fly() {
        System.out.println("苍蝇可以在空中飞行");
    }

    public static void main(String[] args) {
        CangYin cangYin=new CangYin(6);
        cangYin.fly();
        cangYin.reproduce();
    }
}
