package misyu;
//评委打分，去掉一个最大值，去掉一个最低值，然后求出平均值
import java.util.Scanner;

public class Score {
    public static void main(String[] args) {
        int arr[] = new int[6];
        Scanner sc = new Scanner(System.in);
        //录入评分
        for (int x=0;x<arr.length;x++){
            System.out.println("请输入第"+(x+1)+"个评分");
            arr[x] = sc.nextInt();
        }
        //选出最高分
        int max = maxSocre(arr);

        //选出最低分
        int min = minSocre(arr);

        //算出平均值
        int average = averageScore(arr,max,min);
        System.out.println(average);
    }

    public static int maxSocre(int arr[]) {
        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            if(max>arr[i]){
                max = arr[i];
                break;
            }
        }
        return max;
    }

    public static int minSocre(int arr[]) {
        int min = arr[0];
        for(int i=0;i<arr.length;i++){
            if(min<arr[i]){
                min = arr[i];
                break;
            }
        }
        return min;
    }
    public static int averageScore(int[]arr,int max,int min){
        int sum = 0;
        int avaerage = 0;
        for (int i=0;i<arr.length;i++){
            sum += arr[i];
        }
        avaerage = (sum-max-min)/ (arr.length-2);
        return avaerage;
    }
}
