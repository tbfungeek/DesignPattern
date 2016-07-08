package abstactFactory.concrete;

import abstactFactory.abs.AbsHole;

public class SmallHole implements AbsHole {
    @Override
    public void printHoleSize() {
        System.out.println("SmallHole");
    }
}
