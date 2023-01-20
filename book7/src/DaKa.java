import java.util.Scanner;

public class DaKa {
    public static void main(String[] args) {
        String names = "张三，李四，王五，赵六，周七，王哲，白浩，贾蓉，慕容阿三，黄蓉";

        while (true){
            Scanner sc=new Scanner(System.in);
            System.out.println("请输入姓名");
            String name=sc.next();
            if (names.indexOf(name)!=-1){
                System.out.println("签到成功");
            }
            else{
                System.out.println("签到失败");
            }
        }
    }
}
