public class Gongwuyuan {
    public void work(){
        System.out.println("公务员的工作");
    }

    public static void main(String[] args) {
        zongTong zongTong1=new zongTong();
        System.out.println(zongTong1 instanceof Gongwuyuan);
        zongTong1.work();
        Gongwuyuan gongwuyuan=new Gongwuyuan();
        gongwuyuan.work();
    }
}
class zongTong extends Gongwuyuan{
    @Override
    public void work(){
        System.out.println("总统的工作");
    }

}
