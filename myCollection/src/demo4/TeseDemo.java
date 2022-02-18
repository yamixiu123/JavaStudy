package demo4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class TeseDemo {
    public static void main(String[] args) {
        ArrayList<String> s = new ArrayList<String>();
        s.add("bye");
        s.add("goodbye");
        Iterator<String> si = s.iterator();

        while(si.hasNext()){
            System.out.println(si.next());
        }
        for (int i = 0 ;i<s.size();i++){
            System.out.println(s.get(i));
        }
        for(String str:s){
            System.out.println(str);
        }

        LinkedList<String> sl = new LinkedList<String>();
        s.add("bye");
        s.add("goodbye");
        ListIterator<String> sli = sl.listIterator();

        while(sli.hasNext()){
            System.out.println(si.next());
        }
        for (int i = 0 ;i<s.size();i++){
            System.out.println(s.get(i));
        }
        for(String str:s){
            System.out.println(str);
        }
    }
}
