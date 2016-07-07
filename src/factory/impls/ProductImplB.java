package factory.impls;

import factory.abs.AbsProduct;

public class ProductImplB implements AbsProduct {
    @Override
    public void doSomething() {
        System.out.println("This messsage is come from "+ ProductImplB.class.getSimpleName());
    }
}
