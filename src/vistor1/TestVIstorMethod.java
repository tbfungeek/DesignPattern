package vistor1;

public class TestVIstorMethod {

    public static void main(String args[]) {
        Vistor leader = new Leader();
        Engeener engeener = new Engeener();
        engeener.accept(leader);
    }
}
