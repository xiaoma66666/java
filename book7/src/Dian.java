public interface Dian {
    default void dian(){}
}
class Mach implements Dian {
    public static void main(String[] args) {
    Mach a = new Mach() {
        @Override
        public void dian() {
            System.out.println("每个火柴只能点燃一次");
        }
    };
    a.dian();
}
}
