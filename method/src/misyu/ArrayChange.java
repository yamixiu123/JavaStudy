package misyu;
//实现数组的交换
public class ArrayChange {
    public static void main(String[] args) {
        int []arr = {19,28,37,46,50};
        reverse(arr);
        forItemin(arr);
        }


    public static void reverse(int[] arr){
        for (int startIndex = 0, endIndex = arr.length - 1; startIndex <= endIndex; startIndex++, endIndex--){
            int temp = 0;
            temp= arr[startIndex];
            arr[startIndex] = arr[endIndex];
            arr[endIndex] = temp;
        }
    }

    public static void forItemin(int []arr) {
    for (int i =0;i<arr.length;i++){
        if (i==0){
            System.out.print("[");
            System.out.print(arr[i]);
            System.out.print(",");
        }
        else if (i == arr.length-1){
            System.out.print(arr[i]);
            System.out.print("]");
        }
        else {
            System.out.print(arr[i]);
            System.out.print(",");
        }
    }
    }
}

