import java.util.Locale;

public class TestString2 {
    public static void main(String[] args) {
        String s1="How are you?";
        System.out.println(s1.startsWith("How"));
        System.out.println(s1.endsWith("you"));
        String s=s1.substring(4);
        System.out.println("s="+s);
        s=s1.substring(4,7);
        System.out.println(s);
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());
        String s2=" How are you? ";
        System.out.println(s2.trim());


    }
}
