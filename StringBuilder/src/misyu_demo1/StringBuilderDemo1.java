package misyu_demo1;

public class StringBuilderDemo1 {
    /*public static void main(String[] args) {
        StringBuilder s = new StringBuilder();
        s.append("helloworld");
        String sb = s.toString();
        System.out.println(sb);
    }*/
    public static void main(String[] args) {
        String s = "helloworld";
        StringBuilder sb  = new StringBuilder(s);
        System.out.println(sb);
    }
}
