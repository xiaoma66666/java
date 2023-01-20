public abstract class TuXin1 {
    public abstract void C(double chang1,double chang2,double chang3);
}
class SanJiaoXin extends TuXin1{
    double chang1,chang2,chang3;

    @Override
    public void C(double chang1,double chang2,double chang3) {
        if (chang1+chang2>chang3&&chang1+chang3>chang2&&chang2+chang3>chang1){
            System.out.println("长为"+chang1+","+chang2+","+chang3+"的3条边能构成三角形,这个三角形的周长是"+(chang1+chang2+chang3));
        }
        else {
            System.out.println("长为"+chang1+","+chang2+","+chang3+"的3条边不能构成三角形,因为三角形的两边之和必须大于第三边");
        }
    }

    public static void main(String[] args) {
        SanJiaoXin sanJiaoXin=new SanJiaoXin();
        sanJiaoXin.C(3.0,4.0,5.0);
        sanJiaoXin.C(1.0,4.0,5.0);
    }
}
