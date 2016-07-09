package responsibility;

public class TestResposibilityMain {
    public static void main(String args[]) {
        Handler handler1 = new HandlerOne();
        Handler handler2 = new HandlerTwo();
        Handler handler3 = new HandlerThress();
        Handler defaultHandler = new HandlerDefault();
        handler1.setNextHandler(handler2);
        handler2.setNextHandler(handler3);
        handler3.setNextHandler(defaultHandler);

        Request request = new Request();
        request.setRequestCode(3);
        handler1.handleRequst(request);
        request.setRequestCode(100);
        handler1.handleRequst(request);
    }

}
