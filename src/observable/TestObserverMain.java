package observable;

public class TestObserverMain {

    public static void main(String args[]) {
        Observer observer1 = new ConcreteObserverOne();
        Observer observer2 = new ConcreteObserverTwo();
        SubjectObj subjectObj = new SubjectObj();
        subjectObj.registerObserver(observer1);
        subjectObj.registerObserver(observer2);
        subjectObj.SetState("Notice that I Change the state Now !");
        subjectObj.unregisterObserver(observer2);
        subjectObj.SetState("Notice that I Change the state Now !");
    }
}
