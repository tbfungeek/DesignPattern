package builder2;

public class ProductCar {

    private String mCarColor;
    private int mCarDoorNum;
    private int mCarWheelNum;

    public ProductCar(CarBuilder builder) {
        mCarColor = builder.getColor() == null ? "White" : builder.getColor();
        mCarDoorNum = builder.getDoorNum() == -1 ? 2 : builder.getDoorNum();
        mCarWheelNum = builder.getWheelNum() == -1 ? 4 : builder.getWheelNum();
    }

    public void showCar() {

        System.out.println("A " + this.mCarColor + " Car with " + this.mCarWheelNum +
                " Wheels and " + this.mCarDoorNum + " Doors is Created");
    }

    public static class CarBuilder {
        private String color;
        private int doorNum = -1;
        private int wheelNum = -1;

        public String getColor() {
            return color;
        }

        public CarBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public int getDoorNum() {
            return doorNum;
        }

        public CarBuilder setDoorNum(int doorNum) {
            this.doorNum = doorNum;
            return this;
        }

        public int getWheelNum() {
            return wheelNum;
        }

        public CarBuilder setWheelNum(int wheelNum) {
            this.wheelNum = wheelNum;
            return this;
        }

        public ProductCar build() {
            return new ProductCar(this);
        }

    }
}
