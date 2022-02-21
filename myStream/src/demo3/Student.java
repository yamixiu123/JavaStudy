package demo3;

public class Student {
    private String name;
    private int cnScore;
    private int mathScore;
    private int enScore;

    public Student(String name, int cnScore, int mathScore, int enScore) {
        this.name = name;
        this.cnScore = cnScore;
        this.mathScore = mathScore;
        this.enScore = enScore;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCnScore() {
        return cnScore;
    }

    public void setCnScore(int cnScore) {
        this.cnScore = cnScore;
    }

    public int getMathScore() {
        return mathScore;
    }

    public void setMathScore(int mathScore) {
        this.mathScore = mathScore;
    }

    public int getEnScore() {
        return enScore;
    }

    public void setEnScore(int enScore) {
        this.enScore = enScore;
    }
    public int getSum(){
        return this.getMathScore()+this.getEnScore()+this.getEnScore();
    }
}
