import java.util.Scanner;

public class Color {
}
class RedColor extends Color{

}
class  YellowColor extends Color{

}
class BlueColor extends  Color{

}
class ColorDome {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Color color[] = {new RedColor(), new YellowColor(), new BlueColor()};
        if (sc.nextInt()==1){
        for (int i = 1; i <= 3; i++) {
            int index = (int) (Math.random() * 3);
            judge(color[index]);
        }
    }
}

    public static void judge(Color color) {

            if (color instanceof RedColor) {
                System.out.print("红");
            }
            if (color instanceof YellowColor) {
                System.out.print("黄");
            }
            if (color instanceof BlueColor) {
                System.out.print("蓝");
            }
        }

        }
