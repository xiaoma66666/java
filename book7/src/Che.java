public class Che {
    static void NotKey() throws NullPointerException{
        Object key=null;
        key.toString();
    }

    public static void main(String[] args) {
        try {
            NotKey();
        }catch (Exception e){
            System.out.println("没带车钥匙");
        }
        finally {
            System.out.println("去取一下车钥匙");
        }
    }
}
