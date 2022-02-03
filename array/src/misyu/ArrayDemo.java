package misyu;
//获取一组数组之中的最大值
public class ArrayDemo {
    public static void main(String[] args) {
        int arr[]={11,22,33,44};
        int max = 0;
        for (int x = 1; x < arr.length; x++){
            if (arr[x]>max){
                max = arr[x];
            }

        }
        System.out.println(max);
    }
}
