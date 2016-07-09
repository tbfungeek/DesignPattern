package wraper;

public class TestWrapperMain {
    public static void main(String args[]) {
        AbsConponent conponent = new ConcreteComponent();
        ConcreteWrapper wraper = new ConcreteWrapper(conponent);
        wraper.addTheNewMethod();
    }
}
