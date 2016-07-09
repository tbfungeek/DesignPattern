package conponent;

public class TestConponentMain {


    public static void main(String args[]) {
        Component component1 = new Compositive("组合1");
        Component component2 = new Compositive("组合2");
        Component component3 = new Compositive("组合3");
        Component component4 = new Compositive("组合4");
        Component component5 = new Compositive("组合5");

        Component leaf1 = new Compositive("根节点1");
        Component leaf2 = new Compositive("根节点2");
        Component leaf3 = new Compositive("根节点3");
        Component leaf4 = new Compositive("根节点4");
        Component leaf5 = new Compositive("根节点5");

        component1.addChild(component2);
        component1.addChild(component3);
        component1.addChild(component4);
        component1.addChild(component5);
        component2.addChild(leaf1);
        component2.addChild(leaf2);
        component3.addChild(leaf3);
        component4.addChild(leaf4);
        component4.addChild(leaf5);
    }

}
