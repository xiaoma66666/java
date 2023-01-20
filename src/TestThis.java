public class TestThis {
    int a,b,c;
    TestThis() {
        System.out.println("正要初始化的一个hello对象");
    }
    TestThis(int a,int b) {
        this();//调用无参的构造方法,并且必须位于第一行!
        //a = a;//这里都是指的局部变量而不是成员变量
        this.a = a;
        this.b = b;
        //这样就区分了局部变量和成员变量this.a是成员变量,a是局部变量
    }
    TestThis(int a,int b,int c) {
        this(a, b);//调用带参的构造方法,并且必须位于第一行!
        this.c = c;
        System.out.println("的撒及");
    }
    void sing(){
        System.out.println(a);

    }
    void eat(){
        this.sing();//调用本类中的sing()
        System.out.println("你妈喊你回家吃饭!");

    }

    public static void main(String[] args) {
        TestThis hi=new TestThis(2,3,6);
        hi.eat();
        }
    }

