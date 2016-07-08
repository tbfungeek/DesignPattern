package factoryDemo2.concrete;

import factoryDemo2.abs.AbstractProduct;

public class ConcreteProductA implements AbstractProduct {
    @Override
    public void doSomethingA() {
        System.out.println("Hello This Message is from "+ ConcreteProductA.class.getSimpleName() + " doSomethingA");
    }

    @Override
    public void doSomethingB() {
        System.out.println("Hello This Message is from "+ ConcreteProductA.class.getSimpleName() + " doSomethingB");
    }
}
