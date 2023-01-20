import java.util.Arrays;

public class juzhenzhuanhuan {
    public static void main(String[] args) {
        int[][] array=new int[][]{{91,25,8},{56,14,2},{47,3,67}};
        System.out.println("原数组为:");
        for (int[] i:array
             ) {
            System.out.println(Arrays.toString(i));
        }
        System.out.println("转换后的数组是:");
        for (int i=0;i<3;i++){
            for (int j=0;j<i;j++){

                int temp=array[i][j];
                array[i][j]=array[j][i];
                array[j][i]=temp;
            }
        }
        for (int[] q:array){
            System.out.println(Arrays.toString(q));
        }

    }
}
