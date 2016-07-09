package vistor1;

public class Engeener extends Employee {
    @Override
    public void accept(Vistor leader) {
        leader.doAsTheBossOrder(this);
    }
}
