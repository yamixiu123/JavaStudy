package demo2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

//myStream\test.txt
public class outputDemo {
    public static void main(String[] args) throws IOException {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("xiaoming");
        arrayList.add("baka");
        arrayList.add("kaka");
        BufferedWriter bw = new BufferedWriter(new FileWriter("myStream\\test.txt"));
        for(String str:arrayList){
            bw.write(str);
            bw.newLine();
            bw.flush();
        }
        bw.close();
    }
}
