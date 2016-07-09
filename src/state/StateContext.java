package state;

public class StateContext {

    private stateInterface mState = null;
    private static int StateCode = 0;
    public StateContext() {
    }

    private void createState() {
        if(StateCode == 0) {
            mState = new StateOne(this);
        } else {
            mState = new StateTwo(this);
        }
    }

    protected void changeState() {
        StateCode = (StateCode + 1) % 2;
    }

    public void doSomething() {
        createState();
        if(mState != null) {
            mState.doSthAndSwitchState();
        }
    }
}
