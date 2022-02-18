package demo2;

import javax.rmi.CORBA.Stub;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo {
    public static void main(String[] args) {
        Collection<Student> s = new ArrayList<Student>();
        Student a = new Student(25, "tanaka");
        Student b = new Student();
        b.setAge(20);
        b.setName("sakura");
        Student c = new Student(22, "akari");
        s.add(a);
        s.add(b);
        s.add(c);
        Iterator<Student> sl = s.iterator();
        while (sl.hasNext()) {
            Student student = sl.next();
            System.out.println(student.getAge() + "," + student.getName());
        }


    }
}
