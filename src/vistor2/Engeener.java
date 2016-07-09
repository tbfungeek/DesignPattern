package vistor2;

public class Engeener extends Employee{
    private String mJob;
    @Override
    public void accept(Vistor vistor) {
        vistor.vist(this);
    }

    public String getmJob() {
        return mJob;
    }

    public void setmJob(String mJob) {
        this.mJob = mJob;
    }
}
