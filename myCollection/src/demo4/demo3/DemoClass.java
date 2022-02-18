package demo4.demo3;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class DemoClass {
    public static void main(String[] args) {
        List<Student> sl = new ArrayList<Student>();
        Student s1 = new Student(22,"hanako");
        Student s2 = new Student(22,"kirito");
        Student s3 = new Student(22,"taro");
        sl.add(s1);
        sl.add(s2);
        sl.add(s3);
        //创建集合迭代器对象
        ListIterator<Student> li = sl.listIterator();
        //for循环遍历
        for(int i=0;i<sl.size();i++){
            Student stu = sl.get(i);
            System.out.println(stu.getAge()+","+ stu.getName());
        }
        //迭代器遍历
        while(li.hasNext()){
            Student stu = li.next();
            System.out.println(stu.getAge()+","+ stu.getName());
        }
        //增强for
        for(Student s:sl){
            System.out.println(s.getAge()+","+ s.getName());
        }
    }
}
