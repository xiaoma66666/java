import com.itbaizhan.TestGeneric;

public class Test3 {
    public static void main(String[] args) {
        ShowMsg showMsg=new ShowMsg();
        TestGeneric<Integer>testGeneric=new TestGeneric<>();
       testGeneric.setFlag(20);
        showMsg.shouFlag(testGeneric);


       /* TestGeneric<String>testGeneric1=new TestGeneric<>();
        testGeneric1.setFlag("machen");
        showMsg.shouFlag(testGeneric1);*/


        TestGeneric<Number>testGeneric2=new TestGeneric<>();
        testGeneric2.setFlag(50);
        showMsg.shouFlag(testGeneric2);
    }

}
