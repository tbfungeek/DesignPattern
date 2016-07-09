package templete;

public class TempleteTestMain {

    public static void main(String args[]) {
        ChildTempleClassOne childTempleClassOne = new ChildTempleClassOne();
        childTempleClassOne.temple(new HookCallBack() {
            @Override
            public void methodFromHook() {
                System.out.println("This is print in methodFromHook");
            }
        });

        ChildTempleClassTwo childTempleClassTwo = new ChildTempleClassTwo();
        childTempleClassTwo.temple(new HookCallBack() {
            @Override
            public void methodFromHook() {
                System.out.println("This is print in methodFromHook");
            }
        });
    }

}
