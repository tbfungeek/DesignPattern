package facade;

public class TestFacadeMain {

    public static void main(String args[]) {
        Facade facade = Facade.getInstance();
        facade.testModeMethod();
    }

}
