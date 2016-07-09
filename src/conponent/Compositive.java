package conponent;
import java.util.ArrayList;
public class Compositive extends Component{
    private ArrayList<Component> componentlist = new ArrayList<Component>();
    public Compositive(String name) {
        super(name);
    }

    public String getName() {
        return super.name;
    }

    public void addChild(Component component) {
        if(component!= null) {
            componentlist.add(component);
        }
    }

    public void removeChild(Component component) {
        if(componentlist!= null && componentlist.contains(component)) {
            componentlist.remove(component);
        }
    }

    public Component getComponent(int index) {
        if(componentlist != null) {
            return componentlist.get(index);
        }
        return null;
    }
}