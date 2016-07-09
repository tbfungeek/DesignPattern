package adapter;

public class Adapter implements TargetInf {
    private Adaptee adaptee = null;
    public Adapter(Adaptee mAdaptee) {
        adaptee = mAdaptee;
    }

    @Override
    public void targetOperation() {
        if(adaptee != null) {
            System.out.println("Adapting The Adaptee Interface to Target Interface ");
            adaptee.originOperation();
            System.out.println("Adapte process finished");
        }
    }
}
