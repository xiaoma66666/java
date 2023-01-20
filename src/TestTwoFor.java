/*public class TestTwoFor {
    public static void main(String[] args) {
        int m=1,j=1;
        for (m=1;m<=5;m++)
        {
            for (j=1;j<=5;j++){
                System.out.print(m+"\t");
            }
            System.out.println();
        }
    }
}
*/
/*public class TestTwoFor {
    public static void main(String[] args) {
        int n,m;
        for (n=1;n<=9;n++)
        {
            for (m=1;m<=n;m++){
                System.out.print(m+"*"+n+"="+(n*m<10?(" "+n*m):n*m)+" ");
            }
            System.out.println();
        }
    }
}*/
/*public class TestTwoFor {
    public static void main(String[] args) {
        int i,n;
        for(i=1;i<=5;i++){
            for (n=1;n<=5;n++){
                if((n+i)%2==1){
                    System.out.print("*\t");
                }else {
                    System.out.print("#\t");
                }

            }
            System.out.println();
        }
    }
}*/
public class TestTwoFor {
    public static void main(String[] args) {
        int i,n=0;
        for (i=100;i<=150;i++){
            if (i%3==0){
                continue;
            }
            System.out.print(i+"\t");
            n++;
                    if(n%5==0){
                        System.out.println();
                    }
        }
    }
}