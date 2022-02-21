package demo2;

import java.io.File;

//file C:\ProgramData\Oray\SunloginClient

public class FilePathDemo {
    public static void main(String[] args) {
        File fileName = new File("C:\\ProgramData\\Oray\\SunloginClient");
        arrayFile(fileName);
    }

    public static void arrayFile(File fileName) {
        File[] file = fileName.listFiles();
        for (int i = 0; i < file.length; i++) {
            if (file[i].isDirectory()) {
                arrayFile(file[i]);
            } else {
                System.out.println(file[i]);
            }
        }

    }
}
