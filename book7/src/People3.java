public class People3 {
    final Heart heart=new Heart();
    public People3(){
        heart.Tiao();
    }

    class Heart{
        void Tiao(){
            System.out.println("心脏跳动");
        }
    }

    public static void main(String[] args) {
        new People3();
    }
}
