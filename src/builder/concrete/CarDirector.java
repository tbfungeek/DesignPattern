package builder.concrete;

import builder.abs.AbsCarBuilder;

public class CarDirector {

    private AbsCarBuilder carBuilder = null;
    public CarDirector(AbsCarBuilder builder) {
        carBuilder = builder;
    }

    public void makeupCar (){
        carBuilder.buildCarBody("White car Body");
        carBuilder.buildCarWheel("Black car Wheel");
        carBuilder.buildCarDoor("Deep blue car Door");
        carBuilder.resultCar();
    }

}
