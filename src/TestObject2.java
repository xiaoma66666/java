import java.util.Arrays;

public class TestObject2 {
    public static void main(String[] args) {
       object[] pers=new object[3];
       pers[0]=new object(1001,"高琪",18,"程序员",30000,5000);
       pers[1]=new object(1002,"高小二",19,"讲师",35000,2000);
       pers[2]=new object(1003,"高晓松",20,"教授",20000,3000);
     for (int i=0;i<pers.length;i++)
     {
         System.out.println(pers[i]);
     }




    }
  static class object{

          int 工号;
          String 姓名;
          int 年龄;
          String 岗位;
          int 薪资;

      public int get工号() {
          return 工号;
      }

      public void set工号(int 工号) {
          this.工号 = 工号;
      }

      public String get姓名() {
          return 姓名;
      }

      public void set姓名(String 姓名) {
          this.姓名 = 姓名;
      }

      public int get年龄() {
          return 年龄;
      }

      public void set年龄(int 年龄) {
          this.年龄 = 年龄;
      }

      public String get岗位() {
          return 岗位;
      }

      public void set岗位(String 岗位) {
          this.岗位 = 岗位;
      }

      public int get薪资() {
          return 薪资;
      }

      public void set薪资(int 薪资) {
          this.薪资 = 薪资;
      }

      public int get补助() {
          return 补助;
      }

      public void set补助(int 补助) {
          this.补助 = 补助;
      }

      @Override
      public String toString() {
          return "object{" +
                  "工号=" + 工号 +
                  ", 姓名='" + 姓名 + '\'' +
                  ", 年龄=" + 年龄 +
                  ", 岗位='" + 岗位 + '\'' +
                  ", 薪资=" + 薪资 +
                  ", 补助=" + 补助 +
                  '}';
      }

      public object(int 工号, String 姓名, int 年龄, String 岗位, int 薪资, int 补助) {
          this.工号 = 工号;
          this.姓名 = 姓名;
          this.年龄 = 年龄;
          this.岗位 = 岗位;
          this.薪资 = 薪资;
          this.补助 = 补助;
      }

      int 补助;

  }
}
