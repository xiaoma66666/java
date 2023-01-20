public class TestString1 {
    public static void main(String[] args) {
        String s1="core Java";
        String s2="Core Java";
        System.out.println(s1.charAt(3));
        System.out.println(s1.length());
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.indexOf("Java"));
        System.out.println(s1.indexOf("apple"));
        System.out.println(s1.replace(' ','*'));

        String s=s1.replace(' ','&');
        System.out.println(s);
    }
}
