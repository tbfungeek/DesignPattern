package stragry;

public class TestStragryMain {

    public static void main(String args[]) {
        AbstractStragry stragry1 = new ConcreteStragryOne();
        AbstractStragry stragry2 = new ConcreteStragryTwo();

        StragryContext stragryContext = new StragryContext(stragry1);
        stragryContext.callStragry();

        stragryContext.setStragry(stragry2);
        stragryContext.callStragry();
    }

}
