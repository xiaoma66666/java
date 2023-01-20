public class RedColor extends Light implements Colorful{

    @Override
    public void shine() {
        System.out.println("红灯发红光");
    }
}
class GreenColor extends Light implements Colorful{
    @Override
    public void shine() {
        System.out.println("绿灯发绿光");
    }

    public static void main(String[] args) {
        RedColor redColor=new RedColor();
        redColor.shine();
        GreenColor greenColor=new GreenColor();
        greenColor.shine();
    }
}
