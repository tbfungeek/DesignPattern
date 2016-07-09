package vistor1;

public abstract class Employee {

    public abstract void accept(Vistor leader);
    public void skillOne() {
        System.out.println("Skill One");
    }
    public void skillTwo() {
        System.out.println("Skill Two");
    }
    public void skillThree() {
        System.out.println("Skill Three");
    }
}
