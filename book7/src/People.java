public class People {
    void DianCai(){}

    public static void main(String[] args) {
        People p1=new Teacher();
        Teacher teacher=(Teacher) p1;
        teacher.DianCai();
        People p2=new Student();
        Student student=(Student) p2;
        student.DianCai();
        People p3=new Doctor();
        Doctor doctor=(Doctor) p3;
        doctor.DianCai();
    }
}
class Teacher extends People{
    @Override
    void DianCai() {
        System.out.println("(老师)点了\"香辣肉丝\"");
    }
}
class Student extends  People{
    @Override
    void DianCai() {
        System.out.println("(学生)点了\"火腿炒面\"");
    }
}
class Doctor extends  People{
    @Override
    void DianCai() {
        System.out.println("(医生)点了\"麻辣香锅\"");
    }
}

