package misyu_demo02;

import java.util.ArrayList;
import java.util.Scanner;

/*
创建一个存储字符串的集合存储三个字符串元素，并且遍历该集合
 */
public class ArrayListDemo1 {
    public static void main(String[] args) {
        ArrayList<String> s = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入数字");
            s.add(sc.nextLine());
        }
        for(int i = 0;i<s.size();i++){
            System.out.println(s.get(i));
        }
    }

}
