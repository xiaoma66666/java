public class Student extends People {
    public void job(){
    System.out.println("学生要好好学习");
}

    public static void main(String[] args) {
        Student student=new Student();
        Teacher teacher=new Teacher();
        People people=new People();
        people.job();
        teacher.job();
        student.job();
    }
}

