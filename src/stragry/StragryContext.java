package stragry;

public class StragryContext {

    AbstractStragry mStragry;
    public StragryContext(AbstractStragry stragry) {
        mStragry = stragry;
    }

    public void setStragry(AbstractStragry mStragry) {
        this.mStragry = mStragry;
    }

    public void callStragry() {
        if(mStragry != null) {
            mStragry.stragryMethod();
        }
    }
}
