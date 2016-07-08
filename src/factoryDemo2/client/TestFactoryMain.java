package factoryDemo2.client;

import factoryDemo2.concrete.ConcretFactory;

public class TestFactoryMain {
    public static void main(String args[]) {
        ConcretFactory factory = new ConcretFactory();
        factory.setProductType(-1);
        factory.doSomething();
        factory.setProductType(1);
        factory.doSomething();
        factory.setProductType(2);
        factory.doSomething();
    }
}
