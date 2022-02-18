package misyu_demo1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SortStringArr {
    public static void main(String[] args) {
        //定义一个字符串
        String a = "91 27 46 38 50";
        //用空格进行字符串劈分变为字符串数组
        String[] strArray= a.split(" ");
        //创建数组字符
        int []arr = new int[strArray.length];
        //字符串数组元素int化并放入数组
        for (int i=0;i<strArray.length;i++){
            arr[i] = Integer.parseInt(strArray[i]);
        }
        Arrays.sort(arr);
        //数组排序
        StringBuilder str = new StringBuilder();
        //创建sb对象，进行字符串拼接
        for (int i =0 ; i<arr.length;i++){
            if(i == arr.length){
                str.append(arr[i]);
            }else {
                str.append(" ").append(arr[i]);
            }
            System.out.println(str);
            String av = str.toString();
            System.out.println(av);
        }
    }
}
