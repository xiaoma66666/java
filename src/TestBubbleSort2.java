import java.util.Arrays;

public class TestBubbleSort2 {
    public static void main(String[] args) {
        int[] values = {3, 1, 6, 8, 9, 0, 7, 4, 5, 2};
        bubbleSort2(values);
        System.out.println(Arrays.toString(values));
    }


    public static void bubbleSort2(int[] values) {
        int temp;
        for (int i = 0; i < values.length; i++) {
            boolean flag = true;
            for (int j = 0; j < values.length - i - 1; j++) {
                if (values[j] > values[j + 1]) {
                    temp = values[j];
                    values[j] = values[j + 1];
                    values[j + 1] = temp;
                    flag = false;
                }
            }
            if (flag) {
                break;
            }
            System.out.println((i+1)+"趟排序"+Arrays.toString(values));
        }
    }
}
