public class shudu {
    public static void main(String[] args) {
        int[][] arr={{2,7,6},{ 9, 5, 1 }, { 4, 3, 8 } };
        boolean result=true;
        int sum=arr[0][0]+arr[1][1]+arr[2][2];//计算一条斜边和
        if (sum!=arr[0][2] + arr[1][1] + arr[2][0]){
            result=false;
        }else {
            for (int x=0;x<3;x++){
                //计算行,列的和
                if (sum!=arr[x][0]+arr[x][1]+arr[x][2]||sum!=arr[0][x]+arr[1][x]+arr[2][x]){
                    result=false;
                    break;
                }
            }
        }
        if (result)
            System.out.println("数组行,列,斜边的和相等");
        else
            System.out.println("数组行,列,斜边的和不相等");

    }
}
