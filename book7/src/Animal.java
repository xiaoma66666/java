public class Animal {
    void eat(){

    }
}
class Demo{
    public static void main(String[] args) {
   Animal a=new Animal(){
           @Override
           void eat() {
               System.out.println("猫吃鱼,狗吃肉");
           }
       };
   a.eat();
   }
}