package flyweight;

public class FlyWeight {
    private int id;
    private String name;
    private String sex;
    private int classNo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getClassNo() {
        return classNo;
    }

    public void setClassNo(int classNo) {
        this.classNo = classNo;
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String key;

    public String getKey() {
        return key;
    }

    private void setKey(String key) {
        this.key = key;
    }

    public FlyWeight(String key) {
        this.key = key;
        String keyPart[] = key.split("-");
        sex = keyPart[0];
        classNo = Integer.parseInt(keyPart[1]);
    }

    public String toString() {
        return "id = " + id + " name = " + name + " sex = " + sex + " Class NO. = " + classNo;
    }
}
