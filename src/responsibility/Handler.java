package responsibility;

public interface Handler {
    public void setNextHandler(Handler handler);

    public void handleRequst(Request request);

}
