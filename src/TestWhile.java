public  class TestWhile {
   int a=8;
   int b;

    public  TestWhile(int a, int b) {

        this.a = a;
        this.b = b;
    }

    public void Yu(){

    }

    public static int man(int a){

            return a;
    }

    static int i=1;//局部变量
   static  int sum=0;
    public static void main(String[] args) {

        while (i<=100)
        {              //成员变量
            sum+=i;
            i++;
        }
        System.out.println("1+2+......+100的值为:"+sum);
        System.out.println(args);
    }
}
