package demo2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

////myStream\test.txt
public class InputDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("myStream\\test.txt"));
        String str;
        while ((str=br.readLine())!=null){
            System.out.println(str);
        }
        br.close();

    }
}
