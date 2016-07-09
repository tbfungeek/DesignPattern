package vistor2;

public class Leader extends Employee {

    private String mPerformance;
    @Override
    public void accept(Vistor vistor) {
        vistor.vist(this);
    }

    public String getmPerformance() {
        return mPerformance;
    }

    public void setmPerformance(String mPerformance) {
        this.mPerformance = mPerformance;
    }
}
