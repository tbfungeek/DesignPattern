package mediator;

public class CDReader {
    private String data = null;
    public void readData(String data) {
        this.data = data;
        Mediator.getInstance().processFinished(this);
    }
    public String getData() {
        return this.data;
    }
}
