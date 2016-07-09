package vistor2;

import java.util.ArrayList;

public class ObjectSet {

    private ArrayList<Employee> memberlist = new ArrayList<Employee>();

    public void addMember(Employee employee) {
        memberlist.add(employee);
    }

    public void handleRequest() {
        Vistor visitor = new ConcreteVistor();
        for(Employee em: memberlist) {
            em.accept(visitor);
        }
    }
}
