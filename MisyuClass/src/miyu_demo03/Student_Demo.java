package miyu_demo03;

public class Student_Demo {
    public static void main(String[] args) {
        Student s = new Student();
        s.setAge(30);
        s.setName("baka");
        int age = s.getAge();
        String name = s.getName();
        System.out.println(age);
        System.out.println(name);

    }
}
