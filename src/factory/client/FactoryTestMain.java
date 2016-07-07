package factory.client;

import factory.abs.AbsFactory;
import factory.abs.AbsProduct;
import factory.impls.FactoryImpl;
import factory.impls.ProductImplA;
import factory.impls.ProductImplB;
import factory.impls.ProductImplC;

public class FactoryTestMain {
    public static void main(String args[]) {
        AbsFactory factory = new FactoryImpl();
        AbsProduct product;
        product= factory.createProduct(ProductImplA.class);
        product.doSomething();
        product = factory.createProduct(ProductImplB.class);
        product.doSomething();
        product = factory.createProduct(ProductImplC.class);
        product.doSomething();
    }
}
