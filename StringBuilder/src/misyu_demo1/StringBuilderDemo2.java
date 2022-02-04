package misyu_demo1;

public class StringBuilderDemo2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        String sArr = str(arr);
        System.out.println(sArr);
    }

    public static String str(int[] arr) {
        StringBuilder s = new StringBuilder();
        s.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i < 2) {
                s.append(arr[i]).append(",");
            } else {
                s.append(arr[i]);
            }
        }
        s.append("]");
        String sArr = s.toString();

        return sArr;
    }
}
