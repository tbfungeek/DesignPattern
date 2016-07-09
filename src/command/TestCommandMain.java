package command;

public class TestCommandMain {
    public static void main(String args[]) {

        AbsReceiver receiver = new ConcreteReceiver();
        AbsCommand command = new ConcreteCommand(receiver);
        ConcreteCommandInvoker invoker = new ConcreteCommandInvoker(command);
        invoker.invoke();
    }
}
