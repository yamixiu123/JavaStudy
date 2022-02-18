package misyudemo02;

import java.util.Calendar;
import java.util.Scanner;

public class CalenderDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年份");
        int year = sc.nextInt();
        Calendar cl = Calendar.getInstance();

        cl.set(year,2,1);
        cl.add(Calendar.DATE,-1);
        int date = cl.get(Calendar.DATE);
        System.out.println(date);
    }
}
