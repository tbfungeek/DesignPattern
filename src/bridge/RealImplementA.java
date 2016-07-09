package bridge;

/**
 * Created by jimmy on 7/9/16.
 */
public class RealImplementA implements AbsImplementor {
    @Override
    public void testMethod() {
        System.out.println("This is from RealImplementA");
    }
}
