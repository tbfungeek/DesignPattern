package command;

public class ConcreteCommandInvoker {

    private AbsCommand command = null;
    public ConcreteCommandInvoker(AbsCommand command) {
        this.command = command;
    }

    public void invoke() {
        command.excuteCommand();
    }
}
