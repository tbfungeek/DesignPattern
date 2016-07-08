package factoryDemo2.abs;

public abstract class AbstractFactory {

    protected int mProductType = -1;
    protected AbstractProduct mProduct = null;

    public abstract void setProductType(int productType);

    public abstract AbstractProduct createProduct();

    public void doSomething() {
        mProduct = createProduct();
        if(mProduct != null) {
            mProduct.doSomethingA();
            mProduct.doSomethingB();
        } else {
            System.out.println("Not Support Product Type!");
        }
    }
}
