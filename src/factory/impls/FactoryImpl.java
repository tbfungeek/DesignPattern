package factory.impls;

import factory.abs.AbsFactory;
import factory.abs.AbsProduct;


public class FactoryImpl implements AbsFactory {
    @Override
    public <T extends AbsProduct> T createProduct(Class<T> clzz) {

        AbsProduct product = null;
        try {
            product =  (T) Class.forName(clzz.getName()).newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return (T) product;
    }
}
