public class TestStayic2 {
    static String company;
    static {
        System.out.println("执行类的初始化操作");
        company="百战程序员";
        printcompany();
    }
    public static void printcompany(){
        System.out.println(company);
    }

    public static void main(String[] args) {

    }
}
