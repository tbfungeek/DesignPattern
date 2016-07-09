package Iterator;


public class ConcreIterator implements Iterator {
    private Aggresive agressive = null;
    private int index = -1;
    public ConcreIterator(Aggresive agressive) {
        this.agressive = agressive;
    }
    @Override
    public void first() {
        index = 0;
    }
    @Override
    public void next() {
        index++;
    }
    @Override
    public boolean hasnext() {
        if(index < this.agressive.size()) {
            return true;
        }
        return false;
    }
    @Override
    public Object CurrentItem() {
        return this.agressive.getItem(index);
    }
}
