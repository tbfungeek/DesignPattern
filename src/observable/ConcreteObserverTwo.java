package observable;

/**
 * Created by jimmy on 7/9/16.
 */
public class ConcreteObserverTwo implements Observer {
    @Override
    public void update(SubjectObj subject) {
        System.out.println("This is print in the ConcreteObserverTwo The state of SubjectObj is "+ subject.getCurrentState());
    }
}
