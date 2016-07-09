package cloneable;

public class TestCloneMain {

    public static void main(String args[]) {

        ProtoType protoType = new ProtoType();
        protoType.setId(1);
        PersonInfo info = new PersonInfo();
        info.setAge(24);
        info.setName("Jimmy" + 0);
        protoType.setInfo(info);

        long currentTime = System.currentTimeMillis();
        ProtoType prototype = null;
        PersonInfo infos = null;
        for(int i = 0;i<100000;i++) {
            try {
                prototype = (ProtoType) protoType.clone();
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
            prototype.setId(i);
            try {
                infos = (PersonInfo) info.clone();
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
            if (infos != null) {
                infos.setName("Jimmy" + i);
                infos.setAge(24+i);
                prototype.setInfo(infos);
            }
            //System.out.println(prototype.getId() +" : "+ prototype.getInfo().getAge() +" : " + prototype.getInfo().getName());
        }
        long endTime = System.currentTimeMillis();
        System.out.println("It cost = "+ (endTime - currentTime));


        for(int i = 0;i<100000;i++) {
            prototype = new ProtoType();
            prototype.setId(i);
            try {
                infos = (PersonInfo) info.clone();
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
            if (infos != null) {
                infos.setName("Jimmy" + i);
                infos.setAge(24+i);
                prototype.setInfo(infos);
            }
            //System.out.println(prototype.getId() +" : "+ prototype.getInfo().getAge() +" : " + prototype.getInfo().getName());
        }
        endTime = System.currentTimeMillis();
        System.out.println("It cost = "+ (endTime - currentTime));

    }
}
