public class ex2 {
    int bianhao;
    String name;
    double a1;
    double a2;

    public ex2(int bianhao, String name,double a1, double a2, double a3) {
        this.bianhao = bianhao;
        this.name = name;
        this.a1 = a1;
        this.a2 = a2;
        this.a3 = a3;
    }

    double a3;

    public void f(){
        double ave=(a1+a2+a3)/3;
        System.out.println(this.bianhao+"\t\t"+this.name+"\t\t"+this.a1+"\t\t"+this.a2+"\t\t"+this.a3+"\t\t"+ave);
    }



    public static void main(String[] args) {
        System.out.println("学号\t\t姓名\t\t语文\t\t\t数学\t\t\t英语\t\t\t平均分");
        System.out.println("--------------------------------------------");
        ex2 b1=new ex2(1,"张三",91.5,98.0,89.0);
        b1.f();
        ex2 b2=new ex2(2,"李四",96.0,98.5,93.0);
        b2.f();
    }



}