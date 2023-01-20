public interface Addable {//可增加接口
    void add();
}
interface Reducible{//可减少接口
    void reduce();
}
interface Changeable extends Addable,Reducible{//可变化接口
    final int UNITS = 30;
}
class Number implements Changeable{
  static int number;
    @Override
    public void add() {
        number += Changeable.UNITS;
    }

    @Override
    public void reduce() {
        number-=Changeable.UNITS;
    }

    public static void main(String[] args) {
        Number number1=new Number();
        for (int i=0;i<7;i++){
            number1.add();
        }
        for (int i=0;i<4;i++){
            number1.reduce();
        }
        System.out.println("园区现有游客：" + number + "人。");
    }
}