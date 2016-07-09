package flyweight;

import java.util.HashMap;

public class FlyWeightFactory {

    private FlyWeightFactory(){}

    private static FlyWeightFactory mInstance = null;


    public static FlyWeightFactory getInstance() {
        if(mInstance == null) {
            mInstance = new FlyWeightFactory();
        }
        return mInstance;
    }

    private static HashMap<String,FlyWeight> flyweightMap = new HashMap();
    public FlyWeight getInstanceByKey(String key) {
        FlyWeight item = null;
        if ((item = flyweightMap.get(key)) == null) {
            item = new FlyWeight(key);
            System.out.println("Get by new Instance");
            flyweightMap.put(key, item);
        }
        return item;
    }
}
