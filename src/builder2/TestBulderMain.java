package builder2;

public class TestBulderMain {

    public static void main(String args[]) {
        ProductCar mCar = new ProductCar.CarBuilder().setColor("Yellow").setDoorNum(5).setWheelNum(2).build();
        mCar.showCar();
    }

}
