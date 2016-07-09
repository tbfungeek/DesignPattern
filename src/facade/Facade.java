package facade;

public class Facade {

    private static ModeA mModeA = null;
    private static ModeB mModeB = null;
    private static ModeC mModeC = null;

    private Facade() {
        mModeA = new ModeA();
        mModeB = new ModeB();
        mModeC = new ModeC();
    }
    private static Facade mInstance = null;
    public static Facade getInstance() {
        if(mInstance == null) {
            mInstance = new Facade();
        }
        return mInstance;
    }

    public static void testModeMethod() {
        mModeA.testMode();
        mModeB.testMode();
        mModeC.testMode();
    }
}
