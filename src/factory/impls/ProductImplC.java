package factory.impls;

import factory.abs.AbsProduct;

public class ProductImplC implements AbsProduct {
    @Override
    public void doSomething() {
        System.out.println("This massage is come from "+ ProductImplC.class.getSimpleName());
    }
}
