package demo1;

import java.io.*;

//D:\project\java\method\src\misyu\ArrayChange.java
//myCollection\copy.java
public class myCopyStream {
    public static void main(String[] args) throws IOException {
        InputStreamReader oldFile = new InputStreamReader(new FileInputStream("D:\\project\\java\\method\\src\\misyu\\ArrayChange.java"));
        OutputStreamWriter newFile = new OutputStreamWriter(new FileOutputStream("myStream\\copy.java"));
        char[]bys = new char[1024];
        int len;
        while((len = oldFile.read(bys))!= -1){
            newFile.write(bys);
        }

        oldFile.close();
        newFile.close();


    }
}
