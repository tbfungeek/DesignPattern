package abstactFactory.concrete;

import abstactFactory.abs.AbsHole;

public class BigHole implements AbsHole {
    @Override
    public void printHoleSize() {
        System.out.println("Bit Hold");
    }
}
