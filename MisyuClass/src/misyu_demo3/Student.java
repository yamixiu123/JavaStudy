package misyu_demo3;
/*
    学生クラス
 */

public class Student {
    private int age;
    private String name;

    public Student(){
        System.out.println("无参数构造方法");
    }
    public void show(){
        System.out.println(name+","+age);
    }
}
