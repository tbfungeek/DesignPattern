package singleton;

import java.util.HashMap;
import java.util.Map;

public class SingletonPool {

    public static final String SINGLETONE_KEY_PREFIX = "sigleton_prefix";
    private static final int MAX_POOL_SIZE = 10;
    private static int mCurrentItemId = 0;
    private static Map<String, SingletonPool> mSingletonPools = new HashMap<>();

    private SingletonPool() {

    }

    public static SingletonPool getInstance() {
        String key = SINGLETONE_KEY_PREFIX + mCurrentItemId;
        SingletonPool item = mSingletonPools.get(key);
        if ( item == null ) {
            item = new SingletonPool();
            System.out.println("New Item");
            mSingletonPools.put(key, item);
        } else {
            System.out.println("Get From Cache");
        }
        mCurrentItemId = (mCurrentItemId + 1) % MAX_POOL_SIZE;
        return item;
    }

    public String sayHello() {
        return "Hello I am " + this.toString();
    }
}
