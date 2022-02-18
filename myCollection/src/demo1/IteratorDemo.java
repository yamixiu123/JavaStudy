package demo1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<String>();

        c.add("mixiu");
        c.add("add");

        Iterator<String> d = c.iterator();
        while (d.hasNext()) {
            System.out.println(d.next());
        }
    }
}
