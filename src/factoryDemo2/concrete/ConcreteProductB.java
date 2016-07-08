package factoryDemo2.concrete;

import factoryDemo2.abs.AbstractProduct;

public class ConcreteProductB implements AbstractProduct {
    @Override
    public void doSomethingA() {
        System.out.println("Hello This Message is from "+ ConcreteProductB.class.getSimpleName() + "doSomethingA");
    }

    @Override
    public void doSomethingB() {
        System.out.println("Hello This Message is from "+ ConcreteProductB.class.getSimpleName() + "doSomethingB");
    }
}