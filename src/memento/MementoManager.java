package memento;

/**
 * Created by jimmy on 7/9/16.
 */
public class MementoManager {

    private Memento mMemento = null;

    public void saveMemento(Memento memento) {
        mMemento = memento;
    }

    public Memento getMemento() {
        return this.mMemento;
    }
}
