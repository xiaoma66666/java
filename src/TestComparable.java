import java.util.Arrays;

public class TestComparable {
    public static void main(String[] args) {
        Man[] msMans={new Man(3,"jdi"),new Man(88,"iwajd"),new Man(2,"iwdj")};
        Arrays.sort(msMans);
        System.out.println(Arrays.toString(msMans));
    }
    static class Man implements Comparable{
    int age;
    String id;
    String name;

        public Man(int age, String id) {
            this.age = age;
            this.id = id;
        }

        @Override
        public String toString() {
            return "Man{" +
                    "age=" + age +
                    ", id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }
        public int compareTo(Object o){
            Man man=(Man) o;
            if(this.age<man.age)
            {
                return -1;
            }
            if (this.age>man.age)
            {
                return 1;

            }
            return 0;

        }
    }
}
