import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr=new int[]{63,4,24,1,3,15};
        BubbleSort bubbleSort=new BubbleSort();
        bubbleSort.sort(arr);
    }
    public void sort(int[] arr){
        for (int i=1;i< arr.length;i++) {
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        showArray(arr);
        }

    public void showArray(int[] arr){
        for (int i:arr
             ) {
            System.out.print(">"+i);

        }
        System.out.println();
    }
}
