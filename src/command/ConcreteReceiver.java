package command;

public class ConcreteReceiver implements AbsReceiver {
    @Override
    public void action() {
        System.out.println("The Action is implements by ConcreteReceiver");
    }
}
