
public class Test100SiuJiShu {

    public static void main(String[] args) {
     int totle=0;
        while (true){
            totle=totle+1;
            int i=(int)(100*Math.random())+1;
            System.out.print(i+"\t");
            if (totle%5==0){
                System.out.println();
            }

            if(i==88)
                break;
        }

        System.out.print("totle"+"="+totle);
    }
}
