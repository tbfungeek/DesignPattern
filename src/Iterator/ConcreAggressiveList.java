package Iterator;

import java.util.ArrayList;
public  class ConcreAggressiveList implements Aggresive {
    private ArrayList<Integer> list;
    public ConcreAggressiveList(ArrayList<Integer> list) {
        this.list = list;
    }

    @Override
    public int size() {
        return this.list.size();
    }
    @Override
    public Object getItem(int index) {
        return this.list.get(index);
    }
    @Override
    public Iterator createIterator() {
        return new ConcreIterator(this);
    }
}