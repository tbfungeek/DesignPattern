package bridge;

public class ConcretePart extends  AbstractPart {
    public ConcretePart(AbsImplementor implementor) {
        super(implementor);
    }
    public void someOtherOperation() {
        super.someOption();
    }
}
