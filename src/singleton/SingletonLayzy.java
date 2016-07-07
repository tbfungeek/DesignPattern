package singleton;

public class SingletonLayzy {

    private static SingletonLayzy mInstance = null;

    private SingletonLayzy() {}

    public static synchronized SingletonLayzy getInstance() {
        if( mInstance == null ) {
            mInstance = new SingletonLayzy();
        }
        return mInstance;
    }

    public String sayHello() {
        return "Hello I am " + SingletonLayzy.class.getSimpleName();
    }
}
