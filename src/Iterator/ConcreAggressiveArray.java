package Iterator;

public  class ConcreAggressiveArray implements Aggresive {
    private int array[];
    public ConcreAggressiveArray(int array[]) {
        this.array = array;
    }

    @Override
    public int size() {
        return this.array.length;
    }
    @Override
    public Object getItem(int index) {
        return this.array[index];
    }
    @Override
    public Iterator createIterator() {
        return new ConcreIterator(this);
    }
}