package misyu_demo04.misyu_demo06;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.nextLine();
        //调用该方法并使字符串反转
        String rStr = reverse(str);
        System.out.println(rStr);
    }
    public static String reverse(String str){
        String rStr = "";
        for (int i = str.length()-1;i>=0;i--){
            rStr += str.charAt(i);
        }
        return rStr;
    }
}
