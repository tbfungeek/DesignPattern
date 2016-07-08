package abstactFactory.concrete;

import abstactFactory.abs.AbsTurnips;

public class SmallTurnips implements AbsTurnips {
    @Override
    public void printTurnipsSize() {
        System.out.println("Small Turnips");
    }
}
