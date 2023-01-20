public class TestJavaBean {
    public static void main(String[] args) {
        Emp[] emps={
              new Emp(1001,"高企",18,"讲师","2-14"),
              new Emp(1002,"高晓琪",19,"助教","10-10"),
                new Emp(1002,"高小其",20,"班主任","3-555")

        };

        for (Emp e:emps){
            System.out.println(e);
        }
    }
    static class Emp{
        private int id;
        private String name;
        private int age;
        private String job;
        private  String hiredate;

        @Override
        public String toString() {
            return "Emp{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", age=" + age +
                    ", job='" + job + '\'' +
                    ", hiredate='" + hiredate + '\'' +
                    '}';
        }

        public Emp(int id, String name, int age, String job, String hiredate) {
            this.id = id;
            this.name = name;
            this.age = age;
            this.job = job;
            this.hiredate = hiredate;
        }

    }
}
