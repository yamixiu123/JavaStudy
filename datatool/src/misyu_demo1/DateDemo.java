package misyu_demo1;

import java.util.Date;

public class DateDemo  {
    public static void main(String[] args) {
        Date dd = new Date();
        String ss = DateUtils.dateTostring(dd,"yyyy年MM月dd日");
        System.out.println(ss);
    }
}
