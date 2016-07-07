package singleton;


public enum SingletonEnum {
    INSTANCE;
    private SingletonEnum() {

    }
    public String sayHello () {
        return "Hello I am " + SingletonEnum.class.getSimpleName();
    }
}
