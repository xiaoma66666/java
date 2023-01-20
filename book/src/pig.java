public class pig {
    public boolean equals(Object obj){
        return true;
    }
static class dog{}
    public static void main(String[] args) {
        pig pig1=new pig();
        if (pig1.equals(new dog())){
            System.out.println("猪和狗是同类");
        }
        else
            System.out.println("猪和狗不是同类");

    }
}
