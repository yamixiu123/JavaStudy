package misyu;
//写出一个比较函数正确与否的方法
public class ArrEqual {
    public static void main(String[] args) {
        int[] arr = {11,22,33,44,55};
        int[] arr2 = {11,22,33,44,55};
        boolean result = compare(arr,arr2);
        System.out.println(result);
    }

    public static boolean compare(int[] arr, int[] arr2) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int x = 0; x < arr2.length; x++) {
                if (arr[i] == arr2[x]) {
                    count += 1;
                }
            }
        }
        if (count == arr.length && count == arr2.length) {
            return true;
        } else {
            return false;
        }
    }
}
