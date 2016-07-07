package singleton.client;

import singleton.*;

public class SingletonTestMain {

    public static void main(String[] args) {

        SingletonHungry mSingletonHungry = SingletonHungry.getInstance();
        System.out.println(mSingletonHungry.sayHello());
        SingletonLayzy mSingletonLayzy = SingletonLayzy.getInstance();
        System.out.println(mSingletonLayzy.sayHello());
        SingletonDoubleCheck mSingletonDoubleCheck = SingletonDoubleCheck.getInstance();
        System.out.println(mSingletonDoubleCheck.sayHello());
        SingletonHolder mSingletonHolder = SingletonHolder.getInstance();
        System.out.println(mSingletonHolder.sayHello());
        System.out.println(SingletonEnum.INSTANCE.sayHello());

        for (int i = 0; i < 20; i++) {
            System.out.println(SingletonPool.getInstance().sayHello());
        }
    }
}
