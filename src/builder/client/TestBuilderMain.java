package builder.client;

import builder.abs.AbsCarBuilder;
import builder.concrete.CarDirector;
import builder.concrete.ConcreteCarBuilder;

public class TestBuilderMain {

    public static void main(String args[]) {
        AbsCarBuilder carBuilder = new ConcreteCarBuilder();
        CarDirector director = new CarDirector(carBuilder);
        director.makeupCar();
    }
}
