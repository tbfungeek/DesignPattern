package builder.abs;

public interface AbsCarBuilder {
    public void buildCarBody(String body);
    public void buildCarWheel(String wheel);
    public void buildCarDoor(String door);
    public void resultCar();
}
