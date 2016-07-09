package observable;

public class ConcreteObserverOne implements Observer {
    @Override
    public void update(SubjectObj subject) {
        System.out.println("This is print in the ConcreteObserverOne The state of SubjectObj is "+ subject.getCurrentState());
    }
}
