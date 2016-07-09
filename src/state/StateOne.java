package state;

public class StateOne implements stateInterface {
    private StateContext context = null;
    public StateOne(StateContext context) {
        this.context = context;
    }

    @Override
    public void doSthAndSwitchState() {
        System.out.println("Do some thing in StateOne");
        if(context != null) {
            context.changeState();
        }
    }
}
