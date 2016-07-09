package vistor2;

public class ConcreteVistor implements Vistor{
    @Override
    public void vist(Leader leader) {
        getLeaderInfo(leader);
    }

    @Override
    public void vist(Engeener engeener) {
        getEngeenerInfo(engeener);
    }

    private void getBasicInfo(Employee employee) {
        System.out.println("Id = "+employee.getId());
        System.out.println("Name = "+employee.getName());
    }

    private void getEngeenerInfo(Engeener engeener) {
        getBasicInfo(engeener);
        System.out.println("Job = " + engeener.getmJob());
    }

    private void getLeaderInfo(Leader leader) {
        getBasicInfo(leader);
        System.out.println("Performance = "+ leader.getmPerformance());
    }
}
