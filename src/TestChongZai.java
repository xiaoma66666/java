public class TestChongZai {
    int id;
    String pwd;
    String name;

    public  TestChongZai(){

    }
    public  TestChongZai(int id,String pwd){
        this.id=id;
        this.pwd=pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
            TestChongZai u=new TestChongZai();
            TestChongZai u1=new TestChongZai(666,"66598");

    }
}
