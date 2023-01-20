public class Test99 {
    public static void main(String[] args) {
        int i=1,j=1;
        for(;i<=9;i++){
            for(j=1;j<=i;j++) {
                System.out.print(j+ "*" + i + "=" + (i * j) + "\t");
            }
            System.out.println();
        }

    }
}
