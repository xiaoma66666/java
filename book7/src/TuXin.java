public abstract class TuXin {
    String color;

    public TuXin(String color) {
        this.color = color;
    }
    public abstract double GetS(double a,double b);
}
class ChangFangXin extends TuXin {
    double chang;
    double kuan;
    public ChangFangXin(String color) {
        super(color);
    }

    @Override
    public double GetS(double chang,double kuan) {
        return chang*kuan;
    }

    @Override
    public String toString() {
        return "长为"+chang+",宽为"+kuan+"的"+color+"色长方形的面积是"+GetS(chang,kuan);
    }

    public static void main(String[] args) {
        ChangFangXin changFangXin=new ChangFangXin("黄");
        changFangXin.chang=6.0;
        changFangXin.kuan=5.0;
        System.out.println(changFangXin.toString());
    }
}
