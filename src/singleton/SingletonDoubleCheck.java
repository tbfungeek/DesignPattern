package singleton;

public class SingletonDoubleCheck {

    private static volatile SingletonDoubleCheck mInstance = null;
    private void SingletonDoubleCheck() {

    }

    public static SingletonDoubleCheck getInstance() {
        if(mInstance == null) {
            synchronized(SingletonDoubleCheck.class) {
                if(mInstance == null) {
                    mInstance = new SingletonDoubleCheck();
                }
            }
        }
        return mInstance;
    }

    public String sayHello() {
        return "Hello I am " + SingletonDoubleCheck.class.getSimpleName();
    }
}
