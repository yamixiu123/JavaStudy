package demo5;

import java.util.LinkedList;

public class LinkedHashSet {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("hari");
        ll.add("book");

        for(String str:ll){
            System.out.println(str);
        }
    }
}
