package misyu;

import java.util.Scanner;

public class ArrIndex {
    public static void main(String[] args) {
    int []arr = {19,28,37,46,50};
    Scanner sc = new Scanner(System.in);
    System.out.println("请输入标签文字");
    int number = sc.nextInt();
    int Index = index(number,arr);
    System.out.println("索引为"+Index);
    }
    public static int index(int i,int []arr){
        int Index = -1;
        for(int x=0;x<arr.length;x++){
            if(arr[x]==i){
                Index = x;
                break;
            }
        }
        return Index;
    }
}
