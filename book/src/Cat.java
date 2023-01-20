import static java.awt.Color.black;

public class Cat {
    String name;

    public Cat(String name) {
        this.name = name;
    }
    public void CatMove(){
        System.out.println("猫去抓老鼠了");
    }
    public static void main(String[] args) {
        Cat blackCat=new Cat("black");
        Cat whiteCat=new Cat("white");
        Cat yellowCat=new Cat("yellow");
        System.out.print(blackCat.name);
        blackCat.CatMove();
        System.out.print(whiteCat.name);
        whiteCat.CatMove();
        System.out.print(yellowCat.name);
        yellowCat.CatMove();
    }

}
