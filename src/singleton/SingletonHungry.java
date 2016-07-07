package singleton;

public class SingletonHungry {

    private SingletonHungry(){}

    private static  SingletonHungry mInstance = new SingletonHungry();

    public static  SingletonHungry getInstance() {
        return mInstance;
    }

    public String sayHello() {
        return "Hello I am " + SingletonHungry.class.getSimpleName();
    }

}
