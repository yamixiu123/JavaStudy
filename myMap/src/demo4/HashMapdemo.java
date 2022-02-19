package demo4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class HashMapdemo {
    public static void main(String[] args) {
        ArrayList<HashMap<String,String>> lm  = new ArrayList<HashMap<String,String>>();
        HashMap<String,String> hm1 = new HashMap<String,String>();
        hm1.put("诸葛亮","黄月英");
        hm1.put("孟获","祝融");
        HashMap<String,String> hm2 = new HashMap<String,String>();
        hm2.put("sakura","xiaolang");
        hm2.put("xuetu","touya");
        lm.add(hm1);
        lm.add(hm2);
        for(HashMap<String,String> elment:lm){
            Set<String> hs = elment.keySet();
            for(String key:hs){
                String value = elment.get(key);
                System.out.println(key+","+value);
            }

        }
    }
}
