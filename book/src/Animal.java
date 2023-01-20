public class Animal {
    public void eat(){
        System.out.println("吃食物");
    }

    public static void main(String[] args) {
       Animal animal=new yin();
        animal.eat();
    }
}
class yin extends Animal{
    @Override
    public void eat() {
        System.out.println("吃青蛙");
    }
}
class QingWa extends Animal{

}
class huanChong extends Animal{

}



