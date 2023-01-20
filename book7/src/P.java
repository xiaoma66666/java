public class P {
    public static void main(String[] args) {
        char a[]={'s','t','u','d','e','n','t'};
        String s=new String(a);
        System.out.println(s);
        String s1=new String(a,2,4);
        System.out.println(s1);
        String s2=new String(a,3,4);
        System.out.println(s2);
    }
}
