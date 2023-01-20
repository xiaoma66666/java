import java.util.Scanner;

public class StudentScore {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入本班学生总数:");
        int studentcout=sc.nextInt();
        int achivement[][]=new int[studentcout][4];
        for (int i=0;i<studentcout;i++){
            System.out.println("请输入第"+(i+1)+"个学生的编号");
            achivement[i][0]=sc.nextInt();
            System.out.println("请输入语文成绩:");
            achivement[i][1]=sc.nextInt();
            System.out.println("请输入数学成绩:");
            achivement[i][2]=sc.nextInt();
            System.out.println("请输入英语成绩:");
            achivement[i][3]=sc.nextInt();
        }
        System.out.println("学生成绩如下:");
        System.out.println("----------------------");
        System.out.println("学生编号\t语文成绩\t数学成绩\t英语成绩\t平均成绩\t总成绩");
        for (int i=0;i< achivement.length;i++){
            double sum=0,ave=0;
            for (int j=0;j<achivement[i].length;j++){
                System.out.print("\t"+achivement[i][j]+"\t");
                if (j>0){
                    sum+=achivement[i][j];
                }
            }
            ave=sum/3;
            System.out.print(String.format("%.2f",ave)+"\t"+(int)sum+"\n");
        }
    }
}
