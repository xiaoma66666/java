public interface TypeCRechargeable {
    public abstract void charge();
}
class Car implements TypeCRechargeable,USBRechargeable{

    @Override
    public void charge() {
        System.out.println("汽车上的USB和TypeC接口都能用于给手机充电");
    }

    public static void main(String[] args) {
        Car car=new Car();
        car.charge();
    }
}
