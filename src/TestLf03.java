public class TestLf03 {
    public static void main(String[] args) {
        int age=(int)(Math.random()*120);
        System.out.println("年龄是"+age);
//15以下(不含15):儿童. 15~24青年,25-44中年,45-64中老年,65-84老年,85-99寿星
        //100以上百岁老人

        if (age<15){
            System.out.println("儿童");}
            else if(age<=24){
                System.out.println("青年");}
                else if(age<=44){
                    System.out.println("中年");}
                    else if(age<=64){
                        System.out.println("中老年");}
                        else if(age<=84){
                            System.out.println("老年");}
                            else if(age<=99){
                                System.out.println("寿星");}
                                else{
                                    System.out.println("百岁老人");}
                                }
}

