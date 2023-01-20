import java.util.Objects;

public class TestEquals {
    public static void main(String[] args) {
        Person p1;
        p1 = new Person(123,"MC");
        Person p2;
        p2=new Person(123,"MC");
        System.out.println(p1==p2);
        System.out.println(p1.equals(p2));

    }
   static class Person {
        int id;
        String name;

        public Person(int id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {

            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Person person = (Person) o;
            return id == person.id && Objects.equals(name, person.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, name);
        }
    }
}
