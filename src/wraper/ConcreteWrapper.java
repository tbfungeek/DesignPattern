package wraper;

public class ConcreteWrapper extends  AbsConponentWraper {
    public ConcreteWrapper(AbsConponent component) {
        super(component);
    }

    public void addTheNewMethod() {
        System.out.println("This is the extra method for ConcreteWrapper!");
        super.orginFunction();
    }
}
