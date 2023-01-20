package com.itbaizhan;

public class TestGeneric<T> {
    private T flag;

    public T getFlag() {
        return this.flag;
    }

    public void setFlag(T flag) {
        this.flag = flag;
    }

    public static void main(String[] args) {
        TestGeneric<String> a1=new TestGeneric<String>();
        a1.setFlag("123");
        String flag= a1.getFlag();
        System.out.println(flag);
        TestGeneric<Integer>a2=new TestGeneric<>();
        a2.setFlag(890);
        Integer flag1= a2.getFlag();
        System.out.println(flag1);
    }
}
