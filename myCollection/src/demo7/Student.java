package demo7;

import com.sun.org.apache.bcel.internal.generic.ARETURN;

import java.util.Comparator;

public class Student implements Comparable<Student> {
    private int chineseScore;
    private int mathScore;
    private String name;



    public Student(int chineseScore, int mathScore, String name) {
        this.chineseScore = chineseScore;
        this.mathScore = mathScore;
        this.name = name;
    }

    public Student() {
    }

    public int gettScore() {
        int ts = this.chineseScore+this.mathScore;
        return ts;
    }

    public int getChineseScore() {
        return chineseScore;
    }

    public void setChineseScore(int chineseScore) {
        this.chineseScore = chineseScore;
    }

    public int getMathScore() {
        return mathScore;
    }

    public void setMathScore(int mathScore) {
        this.mathScore = mathScore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public int compareTo(Student s){
        int num = this.gettScore()-s.gettScore();
        if (num == 0){
            //先对名字进行比较,不相同返回1
            if(this.name.compareTo(s.name) != 0){
                return this.name.compareTo(s.name);
            //对数学语文成绩进行比较,相同返回0不相同则返回1
            }else {
                if(this.chineseScore-s.chineseScore==0&this.mathScore-s.mathScore==0){
                    return 0;
                }
                return 1;
            }

        }
        return num;
    }



}

