package demo1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapDemo01 {
    public static void main(String[] args) {
        Map<String, String> strMap = new HashMap<String, String>();
        strMap.put("郭靖","黄蓉");
        strMap.put("tom","jerry");
        strMap.put("ori","gami");
        /*
        Set<String> set = strMap.keySet();
        for(String s:set){
            String value = strMap.get(s);
            System.out.println(s+","+value);
            */
        Set<Map.Entry<String, String>> entries = strMap.entrySet();
        for(Map.Entry<String, String> me : entries){
            System.out.println(me.getKey()+","+me.getValue());
        }

    }

}

