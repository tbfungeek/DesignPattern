package observable;

import java.util.ArrayList;
import java.util.List;

public class SubjectObj {

    private String mState = null;
    private List<Observer> observerList = new ArrayList<>();

    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    public void unregisterObserver(Observer observer) {
        if(observerList.contains(observer)) {
            observerList.remove(observer);
        }
    }

    public void SetState(String state) {
        mState = state;
        for(Observer observer :observerList) {
            observer.update(this);
        }
    }

    public String getCurrentState() {
        return mState;
    }
}
