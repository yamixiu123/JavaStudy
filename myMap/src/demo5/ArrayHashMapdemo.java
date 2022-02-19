package demo5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class ArrayHashMapdemo {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> hm = new HashMap<String, ArrayList<String>>();
        ArrayList<String> sg = new ArrayList<>();
        sg.add("赵云");
        sg.add("诸葛");
        ArrayList<String> hl = new ArrayList<>();
        hl.add("贾宝玉");
        hl.add("林黛玉");
        hm.put("三国演义",sg);
        hm.put("红楼梦",hl);
        Set<String> keySet = hm.keySet();
        for(String key:keySet){
            ArrayList<String> value = hm.get(key);
            for (String name:value){
                System.out.println(key+","+name);
            }
        }
    }
}
