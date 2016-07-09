package proxy;

public class SubjectProxy {

    private  Subject mSubject;
    public SubjectProxy(Subject subject) {
        mSubject = subject;
    }

    public void extraMethodBefore() {
        System.out.println("Extra Method Before RealSubject Method");
    }

    public void extraMethodAfter() {
        System.out.println("Extra Method After RealSubject Method");
    }

    public void request() {

        extraMethodBefore();
        if(mSubject != null) {
            mSubject.request();
        }
        extraMethodAfter();
    }

}
