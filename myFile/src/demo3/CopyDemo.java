package demo3;

import java.io.*;

public class CopyDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream oldFile = new FileInputStream("D:\\project\\水群.txt");
        FileOutputStream newFile = new FileOutputStream("myFile\\newFile.txt");
        int by;
        while((by=oldFile.read())!=-1){
            newFile.write(by);
        }
        oldFile.close();
        newFile.close();
    }
}
