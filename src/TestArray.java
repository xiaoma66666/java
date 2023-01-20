public class TestArray {
    public static void main(String[] args) {
        int[] s;
        s = new int[10];
        for (int i = 0; i < 10; i++) {
            s[i] = 2 * i + 1;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(s[i]);
        }
    }
}
  class Man{
        private int id;
        private int age;

      public int getId() {
          return id;
      }

      public void setId(int id) {
          this.id = id;
      }

      public int getAge() {
          return age;
      }

      public void setAge(int age) {
          this.age = age;
      }

      public Man(int id, int age)
        {
            super();
            this.age=age;
            this.id=id;
        }
    }
    class AppMain{
        public static void main(String[] args) {
            Man[] mans;
            mans=new Man[10];
            Man m1=new Man(1,11);
            Man m2=new Man(2,22);
            mans[0]=m1;
            mans[1]=m2;
            System.out.println(mans[0].getId());
            System.out.println(mans[1].getAge());
        }
    }
