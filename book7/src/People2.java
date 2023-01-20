public class People2 {
    XinZang xinZang=new XinZang();
    void zouLu(){
        System.out.println("人在走路");
        xinZang.zouLu();
    }
    static class XinZang{
        void zouLu(){
            System.out.println("心脏在跳动");
        }
    }

    public static void main(String[] args) {
        People2 people2=new People2();
        people2.zouLu();
    }
}
