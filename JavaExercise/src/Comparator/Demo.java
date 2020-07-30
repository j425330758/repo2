package Comparator;
/*
    比较器排序
    用带参构造方法TreeSet
    存储学生对象并遍历，按年龄从小到大，年龄相同时按姓名字母排序
 */

import java.util.Comparator;
import java.util.TreeSet;

public class Demo {
    public static void main(String[] args) {
        //创建集合对象
        TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>() {
            //大于0表示不需要换位，小于0表示需要
            //s1为新加入的，s2为原来位置上的
            @Override
            public int compare(Student s1, Student s2) {
                System.out.println("s1:"+s1.toString());
                System.out.println("s2:"+s2.toString());
                //this.age - s.age
//                return 0;
                //s1-s2表示从小到大
                //s2-s1表示从大到小
                int num = s1.getAge() - s2.getAge();
                int num2 = num == 0 ? s1.getName().compareTo(s2.getName()) : num;
                return num2;
            }
        });
        //创建学生对象
        Student s1 = new Student("蔷薇",12);
        Student s2 = new Student("暗示",33);
        Student s3 = new Student("自行车",21);
        Student s4 = new Student("完备的",33);
        Student s5 = new Student("玩不起",40);
        Student s6 = new Student("完备的",33);

        //添加学生对象
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);
        ts.add(s6);

        //要进行排序需要让学生类实现comparable接口
        for(Student s:ts){
            System.out.println(s.getName() + "," + s.getAge());
        }
    }
}
