public class TestDiGui {
    public static void main(String[] args) {
        long sum=0;
        for (int i=1;i<=5;i++){
            sum=sum+jiecheng(i);
        }
        System.out.println(sum);

    }
    public static int jiecheng(int n){
        if(n==1){
            return 1;}
            else{
                return n*jiecheng(n-1);
            }
        }

    }

