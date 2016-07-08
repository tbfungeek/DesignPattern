package abstactFactory.concrete;

import abstactFactory.abs.AbsHole;
import abstactFactory.abs.AbsTurnips;
import abstactFactory.abs.AbstractFactory;

public class ConcreteBigFactory implements AbstractFactory {

    @Override
    public AbsHole createHole() {
        return new BigHole();
    }

    @Override
    public AbsTurnips createTurnips() {
        return new BigTurnips();
    }
}
