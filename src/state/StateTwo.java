package state;

public class StateTwo implements stateInterface {
    private StateContext context = null;
    public StateTwo(StateContext context) {
        this.context = context;
    }

    @Override
    public void doSthAndSwitchState() {
        System.out.println("Do some thing in StateTwo");
        if(context != null) {
            context.changeState();
        }
    }
}
