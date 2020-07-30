package Clone;

public class Demo1{

    public static void main(String[] args)  {
        Student s = new Student("zhangsan",23);
        Student s2 = (Student) s.clone();
        s.setName("lisi");
        System.out.println(s.toString());
        System.out.println(s2.toString());

    }
}
