package Iterator;

import java.util.ArrayList;

public class TestIteraorMain {
    public static void main(String args[]) {
        int testArray[] = {1,2,3,4,5,5,6,7,7,8,8,9};
        ConcreAggressiveArray aggressive = new ConcreAggressiveArray(testArray);
        Iterator iterator = aggressive.createIterator();
        iterator.first();
        while(iterator.hasnext()) {
            Object obj = iterator.CurrentItem();
            System.out.println("obj = "+obj.toString());
            iterator.next();
        }
        System.out.println("====================================================");
        ArrayList<Integer> lists = new ArrayList<>();
        lists.add(1);
        lists.add(12);
        lists.add(13);
        lists.add(14);
        lists.add(15);
        lists.add(16);
        lists.add(17);
        ConcreAggressiveList list = new ConcreAggressiveList(lists);
        Iterator iterators = list.createIterator();
        iterators.first();
        while(iterators.hasnext()) {
            Object obj = iterators.CurrentItem();
            System.out.println("obj = "+obj.toString());
            iterators.next();
        }
    }
}
