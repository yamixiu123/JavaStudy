package demo3;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

//定义五个学生信息，按照成绩总分从高到低写入文本文件
public class TestDemo {
    public static void main(String[] args) throws IOException {
        TreeSet<Student> students =new TreeSet<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                int num = s2.getSum()-s1.getSum();
                int num2 = num==0?s2.getCnScore()-s1.getCnScore():num;
                int num3 = num2==0?s2.getEnScore()-s1.getEnScore():num2;
                int num4 = num3==0?s2.getName().compareTo(s1.getName()):num3;
                return num4;
            }

        });
        //定义学生类
        for(int i=0;i<5;i++){
            Scanner sc = new Scanner(System.in);

            System.out.println("请输入学生姓名");
            String name = sc.nextLine();
            System.out.println("请输入学生中文成绩");
            int chinese = sc.nextInt();
            System.out.println("请输入学生数学成绩");
            int math = sc.nextInt();
            System.out.println("请输入学生英语成绩");
            int en = sc.nextInt();


            //键盘录入信息，并给学生类定义，然后将学生对象放入treeset集合，排序使用比较器来比较总分。
            Student s = new Student(name,chinese,math,en);
            students.add(s);
        }
        //创建输出流对象，输出流从treeset读取，然后并用string build拼接，通过输出流放入txt文件
        BufferedWriter bw = new BufferedWriter(new FileWriter("myStream\\test.txt"));


        for (Student student:students){
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(student.getName()).append(",").append(student.getCnScore()).append(",").append(student.getEnScore()).append(",").append(student.getMathScore());
            bw.write(stringBuilder.toString());
            bw.newLine();
        }

        bw.close();

        //close

    }


}



