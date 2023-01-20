import com.itbaizhan.TestGeneric;

public class ShowMsg {

    public void shouFlag(TestGeneric<? extends Number> testGeneric){
        System.out.println(testGeneric.getFlag());
    }

}
