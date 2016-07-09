package templete;

public class ChildTempleClassTwo extends TempleClass {

    protected void stepTwo() {
        System.out.println("This is from ChildTempleClassTwo");
    }
    protected void TempleMethodOne() {
        System.out.println("This is from ChildTempleClassTwo TempleMethodOne");
    }
    protected void TempleMethodTwo() {
        System.out.println("This is from ChildTempleClassTwo TempleMethodTwo");
    }
}
