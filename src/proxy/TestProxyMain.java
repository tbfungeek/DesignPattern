package proxy;

public class TestProxyMain {

    public static void main(String args[]) {
        RealSubject realSubject = new RealSubject();
        SubjectProxy subjectProxy = new SubjectProxy(realSubject);
        subjectProxy.request();
    }
}
