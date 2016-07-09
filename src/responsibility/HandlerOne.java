package responsibility;

public class HandlerOne implements Handler {

    private Handler mNextHandler = null;
    private int handleReqestCode = 1;
    @Override
    public void setNextHandler(Handler handler) {
        mNextHandler = handler;
    }

    @Override
    public void handleRequst(Request request) {
        if( request.getRequestCode() == handleReqestCode) {
            System.out.println("This request has been handle by HandlerOne");
        } else {
            if(mNextHandler == null) {
                return;
            }
            mNextHandler.handleRequst(request);
        }
    }
}
