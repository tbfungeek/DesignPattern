package vistor1;

public class Leader implements Vistor{
    @Override
    public void doAsTheBossOrder(Employee employee) {
        employee.skillOne();
        employee.skillTwo();
        employee.skillThree();
        reportToBoss();
    }

    private void reportToBoss() {
        System.out.println("I have finish the job all by myself");
    }
}
