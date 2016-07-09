package wraper;

public class AbsConponentWraper implements AbsConponent {

    private  AbsConponent component = null;
    public AbsConponentWraper(AbsConponent component) {
        this.component = component;
    }

    @Override
    public void orginFunction() {
        component.orginFunction();
    }
}
