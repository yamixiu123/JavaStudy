package misyu;

import java.util.Scanner;

//有一对兔子，出生后第三个月起，每个月都生一对兔子，小兔子长到第三个月后又每个月生一对兔子，假如兔子都不死，问第二十个月的兔子对数为多少
//1,1,2,3,5,8 当月>=3时 兔子对数为前两项之和 arr[i]=arr[i-1]+arr[i-2] 变量1 月数 变量2 兔子对数
public class MyMethod {
    public static void main(String[] args) {
        int []arr = new int[20];
        arr[0]=1;
        arr[1]=1;


        for(int i=2;i<20;i++){
           arr[i]=arr[i-1]+arr[i-2];
            System.out.println(arr[i]);

        }
        }

    }

