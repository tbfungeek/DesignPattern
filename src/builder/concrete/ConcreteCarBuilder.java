package builder.concrete;

import builder.abs.AbsCarBuilder;

public class ConcreteCarBuilder implements AbsCarBuilder {
    private ProductCar mCar = null;

    public ConcreteCarBuilder() {
        mCar = new ProductCar();
    }

    @Override
    public void buildCarBody(String body) {
        if(mCar == null) {
            return;
        }
        mCar.setBody(body);
    }

    @Override
    public void buildCarWheel(String wheel) {
        if(mCar == null) {
            return;
        }
        mCar.setWheel(wheel);
    }

    @Override
    public void buildCarDoor(String door) {
        if(mCar == null) {
            return;
        }
        mCar.setDoor(door);
    }

    public void resultCar() {
        System.out.println("Car Door : " + mCar.getDoor());
        System.out.println("Car Wheel : " + mCar.getWheel());
        System.out.println("Car Body : " + mCar.getBody());
    }

}
