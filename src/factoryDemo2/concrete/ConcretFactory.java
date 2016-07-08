package factoryDemo2.concrete;


import factoryDemo2.abs.AbstractFactory;
import factoryDemo2.abs.AbstractProduct;

public class ConcretFactory extends AbstractFactory {

    @Override
    public void setProductType(int productType) {
        super.mProductType = productType;
    }

    @Override
    public AbstractProduct createProduct() {

        if(mProductType == 1) {
            return new ConcreteProductA();
        } else if(mProductType ==2) {
            return new ConcreteProductB();
        }
        return null;
    }
}
