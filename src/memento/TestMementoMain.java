package memento;

public class TestMementoMain {

    public static void main(String args[]) {
        Originator originator = new Originator("初始状态");
        originator.runSomeOperationBeforeBackup("运行一段时间后的状态");
        Memento memento = originator.backUpState();
        MementoManager manager = new MementoManager();
        manager.saveMemento(memento);
        originator.runSomeOperationBeforeBackup("再次运行一段时间后的状态");
        originator.reportState();
        Memento memento1 = manager.getMemento();
        originator.restoreState(memento1);
        originator.reportState();
    }
}
