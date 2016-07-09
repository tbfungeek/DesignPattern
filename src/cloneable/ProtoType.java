package cloneable;

public class ProtoType implements Cloneable {
    private long id = 0;

    public PersonInfo getInfo() {
        return info;
    }

    public void setInfo(PersonInfo info) {
        this.info = info;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    private PersonInfo info = null;

    @Override
    public Object clone() throws CloneNotSupportedException {
        ProtoType protoType = null;
        //clone self
        protoType = (ProtoType) super.clone();
        //clone reference object
        protoType.info = (PersonInfo) this.info.clone();
        return protoType;
    }
}
