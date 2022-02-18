package demo7;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        Student s1 = new Student(120,52,"小明");
        Student s2 = new Student(110,112,"小红");
        Student s3 = new Student(90,122,"小明");
        TreeSet<Student>stu = new TreeSet<Student>();
        stu.add(s1);
        stu.add(s2);
        stu.add(s3);
        for(Student s:stu){
            System.out.println(s.getName()+","+s.gettScore());
        }
    }
}
