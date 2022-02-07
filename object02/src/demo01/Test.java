package demo01;

public class Test {
    public static void main(String[] args) {
        Students s = new Students();
        Teacher t = new Teacher();
        s.setAge("20");
        s.setName("misyu");
        t.setAge("30");
        t.setName("Misyu");
        s.method();
        t.method();
        s.show();
        t.show();
    }
}
