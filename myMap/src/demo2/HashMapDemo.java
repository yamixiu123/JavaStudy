package demo2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        Student s1 = new Student(24, "xiaoming");
        Student s2 = new Student(25, "xiaohong");
        Student s3 = new Student(26, "sakura");
        HashMap<String, Student> sl = new HashMap<String, Student>();

        sl.put("001", s1);
        sl.put("002", s2);
        sl.put("003", s3);

        Set<String> keyset = sl.keySet();
        for (String s : keyset) {
            Student value = sl.get(s);
            System.out.println(value.getName() + "," + s);
        }

        Set<Map.Entry<String, Student>> entrySet = sl.entrySet();
        for(Map.Entry<String, Student> me: entrySet ){
            String key = me.getKey();
            Student value = me.getValue();
            System.out.println(key+","+value.getName());
        }
    }
}
