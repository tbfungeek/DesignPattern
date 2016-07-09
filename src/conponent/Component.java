package conponent;

public abstract class Component {
    public String name = null;

    public Component(String name) {
        this.name = name;
    }

    public void addChild(Component component) {
        throw new UnsupportedOperationException();
    }

    public void removeChild(Component component) {
        throw new UnsupportedOperationException();
    }

    public Component getComponent(int index) {
        throw new UnsupportedOperationException();
    }

    public abstract String getName();

}