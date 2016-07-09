package vistor2;

public class TestVistorMain {

    public static void main(String args[]) {
        Engeener engeener = new Engeener();
        engeener.setId(1000);
        engeener.setName("Jimmy");
        engeener.setmJob("Android Programer");

        Leader leader = new Leader();
        leader.setId(10001);
        leader.setName("HelloKetty");
        leader.setmPerformance("Good");

        ObjectSet objectSet = new ObjectSet();
        objectSet.addMember(engeener);
        objectSet.addMember(leader);
        objectSet.handleRequest();
    }
}
