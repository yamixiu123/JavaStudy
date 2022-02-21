package demo1;

import java.io.*;

public class myCopyStreamDemo2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("D:\\project\\java\\method\\src\\misyu\\ArrayChange.java"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("myStream\\copy.java"));
        String str;
        while((str = br.readLine())!=null){
            bw.write(str);
            bw.newLine();
        }
        br.close();
        bw.close();
    }
}
