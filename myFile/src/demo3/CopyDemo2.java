package demo3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDemo2 {
    public static void main(String[] args) throws IOException {
        FileInputStream oldJpg = new FileInputStream("C:\\Users\\Owner\\Pictures\\shark.jpg");
        FileOutputStream newJpg = new FileOutputStream("myFile\\newShark.jpg");

        byte [] bys = new byte[1024];
        int len;
        while ((len = oldJpg.read(bys))!=-1){
            newJpg.write(bys,0,len);
        }
        oldJpg.close();
        newJpg.close();

    }
}
