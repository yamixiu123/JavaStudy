package demo01;

public class Students extends Teacher {
    private String name;
    private String age;

    public Students() {
    }

    @Override
    public void method() {
        System.out.println("I can play");
    }
}