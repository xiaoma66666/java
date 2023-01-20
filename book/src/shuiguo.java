import javax.imageio.stream.ImageInputStream;

public class shuiguo {
    String color;
    String name;
    double weight;
    double price;

    public shuiguo(String color, String name, double weight, double price) {
        this.color = color;
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    @Override
    public String toString() {
        return this.color+"的苹果被称为"+this.name+"每500克"+ this.price + "元,买了"+this.weight+"克"+this.name+"需支付"+this.price*(this.weight/500)+"元";

    }


    public static void main(String[] args) {
        shuiguo apple=new shuiguo("红色","糖心富士",2500,4.98);
        System.out.println(apple.toString());
    }
}
