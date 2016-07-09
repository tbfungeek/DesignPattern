package flyweight;

public class FlyWeightMain {

    public static void main(String args[]) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 5; j++) {
                if(i == 0) {
                    FlyWeightFactory.getInstance().getInstanceByKey("M-"+j);
                } else {
                    FlyWeightFactory.getInstance().getInstanceByKey("F-"+j);
                }
            }
        }

        FlyWeight item1 = FlyWeightFactory.getInstance().getInstanceByKey("M-"+3);
        item1.setId(1000);
        item1.setName("Jimmy");
        System.out.println(item1.toString());


        FlyWeight item2 = FlyWeightFactory.getInstance().getInstanceByKey("F-"+100);
        item2.setId(10010);
        item2.setName("Lucy");
        System.out.println(item2.toString());
    }
}
