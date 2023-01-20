public class TestStatic {
    int id;
    String name;
    String pwd;
    static String company="北京尚学堂";
    public TestStatic(int id,String name){
        this.id=id;
        this.name=name;
    }
    public void login(){

        System.out.println(name);
    }
    public static void printCompany(){
        System.out.println(company);
    }
    public static void main(String[] args){
        TestStatic u=new TestStatic(101,"高崎");
        TestStatic.printCompany();
        TestStatic.company="北京阿里爷爷";
        TestStatic.printCompany();
    }
}
