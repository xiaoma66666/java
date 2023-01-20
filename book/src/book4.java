public class book4 {


    public static void main(String[] args) {
        String[][] arr=new String[3][2];

        arr[0][0]="历史类读物";
        arr[1][0]="经济类读物";
        arr[1][1]="现代科学类读物";
        System.out.println("向该书柜第1层第1列放入" + arr[0][0]);
        System.out.println("向该书柜第2层第1列放入" + arr[1][0]);
        System.out.println("向该书柜第2层第2列放入" + arr[1][1]);
    }
}
