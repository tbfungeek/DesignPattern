package factory.impls;

import factory.abs.AbsProduct;

public class ProductImplA implements AbsProduct {
    @Override
    public void doSomething() {
        System.out.println("This Message is Come from " + ProductImplA.class.getSimpleName());
    }
}
