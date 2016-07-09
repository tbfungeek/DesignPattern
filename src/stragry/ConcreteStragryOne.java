package stragry;

public class ConcreteStragryOne extends AbstractStragry {

    @Override
    public void stragryStepOne() {
        System.out.println("StragryStepOne from ConcreteStragryOne is call");
    }

    @Override
    public void stragryStepTwo() {
        System.out.println("stragryStepTwo from ConcreteStragryOne is call");
    }
}
