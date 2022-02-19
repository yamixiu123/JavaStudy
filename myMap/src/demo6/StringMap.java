package demo6;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class StringMap {
    public static void main(String[] args) {
        HashMap<Character,Integer> abetMap = new HashMap<Character,Integer>();
        Scanner sc =new Scanner(System.in);
        System.out.println("アルファベット入力シテクダサイ");
        String abet = sc.nextLine();
        for(int i =0;i<abet.length();i++){
            Character key = abet.charAt(i);
            if(abetMap.get(key)==null){
                abetMap.put(key,1);
            }else{
                Integer value = abetMap.get(abet.charAt(i));
                value++;
                abetMap.put(key,value);
            }
        }
        Set<Character> keySet = abetMap.keySet();
        StringBuilder result = new StringBuilder();
        for(Character key:keySet){
            Integer value = abetMap.get(key);
            result.append(key).append("(").append(value).append(")");
        }
        String sResult = result.toString();
        System.out.println(sResult);

    }
}
