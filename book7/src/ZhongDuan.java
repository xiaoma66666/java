public class ZhongDuan {
    public static void main(String[] args) {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.print(i);
                if (i == 2) {
                    throw new Exception("中断循环");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(i);
            try {
                if (i == 2) {
                    throw new Exception("循环不会中断");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
