package demo8;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<Integer>();

        Random r = new Random();

        while(set.size()<10){
            int num = r.nextInt(20)+1;
            set.add(num);
        }
        System.out.println(set);
    }
}
