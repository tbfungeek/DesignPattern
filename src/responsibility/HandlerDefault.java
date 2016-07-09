package responsibility;

public class HandlerDefault implements Handler {

    @Override
    public void setNextHandler(Handler handler) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void handleRequst(Request request) {
        System.out.println("This request has been handle by HandlerDefault");
    }
}
