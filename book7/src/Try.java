public class Try {
    public static void main(String[] args) {
        try {
            String name="LiLi";
            System.out.println(name+"年龄是");
            int age=Integer.parseInt("20L");
            System.out.println(age);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("program over");
    }
}
