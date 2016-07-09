package bridge;

public class AbstractPart {

    private AbsImplementor mImpl = null;
    public AbstractPart(AbsImplementor implementor) {
        mImpl = implementor;
    }

    public void someOption() {
        mImpl.testMethod();
    }
}
