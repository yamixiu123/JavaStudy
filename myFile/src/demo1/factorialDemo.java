package demo1;

public class factorialDemo {
    public static void main(String[] args) {
        int n = 5;
        int result = factorial(5);
        System.out.println(result);
    }

    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
