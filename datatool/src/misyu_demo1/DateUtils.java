package misyu_demo1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
    private DateUtils(){};
    public static String dateTostring(Date date,String format){
        SimpleDateFormat dd = new SimpleDateFormat(format);
        String ss = dd.format(date);
        return ss;
    }
    public static Date stringTodate(String s, String format) throws ParseException {
        SimpleDateFormat sf = new SimpleDateFormat(format);
        Date dd = sf.parse(s);
        return dd;
    }

}
