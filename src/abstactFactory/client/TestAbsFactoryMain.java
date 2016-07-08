package abstactFactory.client;

import abstactFactory.concrete.ConcreteBigFactory;
import abstactFactory.concrete.ConcreteSmallFactory;

/**
 * Created by jimmy on 7/8/16.
 */
public class TestAbsFactoryMain {

    public static void main(String args[]) {
        ConcreteBigFactory bigFactory = new ConcreteBigFactory();
        bigFactory.createHole().printHoleSize();
        bigFactory.createTurnips().printTurnipsSize();

        ConcreteSmallFactory smallFactory = new ConcreteSmallFactory();
        smallFactory.createHole().printHoleSize();
        smallFactory.createTurnips().printTurnipsSize();
    }
}
