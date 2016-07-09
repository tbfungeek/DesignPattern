package templete;

public abstract class TempleClass {
    private void stepOne() {
        System.out.println("This is step One from TempleClass");
    }
    protected void stepTwo() {
        System.out.println("This is step Two will be call by Child Temple with Overwrite");
    }
    protected final void stepThree() {
        System.out.println("This is step Three will be call by Child Temple without Overwrite");
    }
    protected abstract void TempleMethodOne();
    protected abstract void TempleMethodTwo();
    public void temple(HookCallBack callback){
        stepOne();
        stepTwo();
        stepThree();
        TempleMethodOne();
        TempleMethodTwo();
        callback.methodFromHook();
    }
}