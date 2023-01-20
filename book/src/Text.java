public class Text {
    public static void main(String[] args) {
        AutoCar autoCar=new AutoCar();
        System.out.println("自动挡汽车有"+autoCar.pedalAuto+"块踏板");
        autoCar.stepOnGas();
        autoCar.stepOdBreak();
    }
}
