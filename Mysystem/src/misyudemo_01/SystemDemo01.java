package misyudemo_01;

public class SystemDemo01 {
    public static void main(String[] args) {
       /* long start = System.currentTimeMillis();
        for (int i=0;i<10000;i++){
            System.out.println(i);
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);

        */
        int arr[] = {34,53,22,56,222,4};
        for(int x= 0;x<arr.length-1;x++){
            for (int i =0;i<arr.length-1-x;i++){
                if (arr[i]>arr[i+1]){
                    int temp;
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
        arraytostring(arr);
    }
    public static void arraytostring(int []arr){
        System.out.print("[");
        for(int i =0;i<arr.length;i++){
            if (i==arr.length-1){
                System.out.print(arr[i]);
            }else {
                System.out.print(arr[i]+",");
            }
        }
        System.out.print("]");
    }
    /*
        public void println(Object x) {
            String s = String.valueOf(x);
            synchronized (this) {
                print(s);
                newLine();
            }
    }*/
    /*
        public static String valueOf(Object obj) {
        return (obj == null) ? "null" : obj.toString();
    }
     */
    /*
        public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }
     */
}
