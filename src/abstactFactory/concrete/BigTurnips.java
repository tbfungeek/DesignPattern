package abstactFactory.concrete;


import abstactFactory.abs.AbsTurnips;

public class BigTurnips implements AbsTurnips {
    @Override
    public void printTurnipsSize() {
        System.out.println("Big Turnips");
    }
}
