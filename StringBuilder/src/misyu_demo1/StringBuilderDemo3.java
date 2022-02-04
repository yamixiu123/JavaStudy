package misyu_demo1;

import java.util.Scanner;

public class StringBuilderDemo3 {
    public static void main(String[] args) {
        System.out.println("请输入一个字符串");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String rstr = reverse(str);
        System.out.println(rstr);
    }
    public static String reverse(String str){
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        String s = sb.toString();
        return s;
    }
}
