package memento;


public class Originator {

    private String mState = null;

    public Originator(String state) {
        mState = state;
    }

    public String getState() {
        return mState;
    }

    public void setState(String mState) {
        this.mState = mState;
    }

    public void reportState() {
        System.out.println(mState);
    }

    private class MementoImpl implements Memento {

        private String mState = null;
        public MementoImpl(String state) {
            mState = state;
        }

        public void saveMemento(String mState) {
            this.mState = mState;
        }

        public String getMemento() {
            return mState;
        }
    }

    public void runSomeOperationBeforeBackup(String state) {
        this.mState = state;
    }

    public Memento backUpState() {
        return new MementoImpl(this.mState);
    }

    public void restoreState(Memento memento) {
        this.mState = ((MementoImpl) memento).getMemento();
    }
}
