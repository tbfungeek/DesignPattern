package command;

public class ConcreteCommand implements AbsCommand {

    private AbsReceiver receiver;

    public ConcreteCommand(AbsReceiver receiver) {
        this.receiver = receiver;
    }
    @Override
    public void excuteCommand() {
        receiver.action();
    }
}
