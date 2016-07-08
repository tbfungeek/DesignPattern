package abstactFactory.concrete;


import abstactFactory.abs.AbsHole;
import abstactFactory.abs.AbsTurnips;
import abstactFactory.abs.AbstractFactory;

public class ConcreteSmallFactory implements AbstractFactory {

    @Override
    public AbsHole createHole() {
        return new SmallHole();
    }

    @Override
    public AbsTurnips createTurnips() {
        return new SmallTurnips();
    }
}
