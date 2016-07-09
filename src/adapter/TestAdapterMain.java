package adapter;

public class TestAdapterMain {

    public static void main(String args[]) {
        Adaptee mAdaptee = new Adaptee();
        TargetInf mTarget = new Adapter(mAdaptee);
        mTarget.targetOperation();
    }
}
