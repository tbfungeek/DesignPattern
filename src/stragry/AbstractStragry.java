package stragry;

public abstract class AbstractStragry implements stragryInterface {

    public void commonHelperMethod() {
        System.out.println("Call commonHelperMethod");
    }

    public abstract void stragryStepOne();
    public abstract void stragryStepTwo();
    @Override
    public void stragryMethod() {
        stragryStepOne();
        stragryStepTwo();
    }
}
