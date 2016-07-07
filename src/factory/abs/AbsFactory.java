package factory.abs;

public interface AbsFactory {
    public <T extends AbsProduct> T createProduct(Class<T> clzz);
}
