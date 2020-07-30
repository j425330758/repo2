package Clone;

import java.io.*;

public class Demo2 {
    public static void main(String[] args) throws Exception {
        Address add = new Address("上海");
        Student s = new Student("zhangsan",23);
        s.setAddress(add);
        Student s2 = (Student) s.clone();
        Student s3 = (Student) Demo2.myClone(s);
        add.setAdd("广西");
        System.out.println(s);
        System.out.println(s2);
        System.out.println(s3);
    }

    public static Object myClone(Object obj) throws Exception {
        //序列化
        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bout);
        oos.writeObject(obj);

        //反序列化
        ByteArrayInputStream bin = new ByteArrayInputStream(bout.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bin);
        return ois.readObject();

    }
}
