package templete;


public class ChildTempleClassOne extends TempleClass {
    protected void stepTwo() {
        System.out.println("This is from ChildTempleClassOne");
    }

    protected void TempleMethodOne() {
        System.out.println("This is from ChildTempleClassOne TempleMethodOne");
    }

    protected void TempleMethodTwo() {
        System.out.println("This is from ChildTempleClassOne TempleMethodTwo");
    }
}

