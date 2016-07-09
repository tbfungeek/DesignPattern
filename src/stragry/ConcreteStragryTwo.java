package stragry;

public class ConcreteStragryTwo extends AbstractStragry {

    @Override
    public void stragryStepOne() {
        System.out.println("StragryStepOne from ConcreteStragryTwo is call");
    }

    @Override
    public void stragryStepTwo() {
        System.out.println("stragryStepTwo from ConcreteStragryTwo is call");
    }
}
