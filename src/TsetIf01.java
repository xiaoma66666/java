public class TsetIf01 {
    public static void main(String[] args) {
        int i=(int)(Math.random()*6)+1;
        int j=(int)(Math.random()*6)+1;
        int k=(int)(Math.random()*6)+1;

        int sum=i+j+k;

        System.out.println("第一次掷色子"+i);
        System.out.println("第二次掷色子"+j);
        System.out.println("第三次掷色子"+k);
        System.out.println("色子总和为"+sum);
        if (sum>=15)
        {
            System.out.println("今天手气不错哦");
        }
        if (sum>=10&&sum<15)
        {
            System.out.println("手气一般,再来一次");
        }
        if (sum<10)
        {
            System.out.println("手气不好,明天再来吧");
        }





    }
}
