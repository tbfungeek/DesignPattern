package singleton;

public class SingletonHolder {

    private SingletonHolder() {

    }

    private static class InnerClass {
        private static SingletonHolder mInstance = new SingletonHolder();
    }

    public static SingletonHolder getInstance() {
        return InnerClass.mInstance;
    }

    public String sayHello() {
        return "Hello I am "+ SingletonHolder.class.getSimpleName();
    }
}
