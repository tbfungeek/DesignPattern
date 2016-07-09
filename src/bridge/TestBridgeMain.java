package bridge;

public class TestBridgeMain {

    public static void  main(String args[]) {
        AbsImplementor ImplA = new RealImplementA();
        ConcretePart partA = new ConcretePart(ImplA);
        partA.someOtherOperation();

        AbsImplementor ImplB = new RealImplementB();
        ConcretePart partB = new ConcretePart(ImplB);
        partB.someOtherOperation();
    }
}
