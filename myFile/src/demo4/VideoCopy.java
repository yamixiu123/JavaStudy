package demo4;

import java.io.*;

public class VideoCopy {
    public static void main(String[] args) throws IOException {
        long startTime = System.currentTimeMillis();

        //method1();
        //method2();
        method3();

        long endTime = System.currentTimeMillis();
        long result = endTime - startTime;
        System.out.println(result);
    }

    public static void method1() throws IOException {
        FileInputStream oldVideo = new FileInputStream("C:\\Users\\Owner\\Videos\\test.mp4");
        FileOutputStream newVideo = new FileOutputStream("myFile\\new.mp4");
        int i;
        while ((i = oldVideo.read()) != -1) {
            newVideo.write(i);
        }
        oldVideo.close();
        newVideo.close();
    }

    public static void method2() throws IOException {
        FileInputStream oldVideo = new FileInputStream("C:\\Users\\Owner\\Videos\\test.mp4");
        FileOutputStream newVideo = new FileOutputStream("myFile\\new.mp4");
        byte[] bys = new byte[1024];
        int len;
        while ((len = oldVideo.read(bys)) != -1) {
            newVideo.write(bys, 0, len);
        }
        oldVideo.close();
        newVideo.close();
    }

    public static void method3() throws IOException {
        BufferedInputStream oldVideo = new BufferedInputStream(new FileInputStream("C:\\Users\\Owner\\Videos\\test.mp4"));
        BufferedOutputStream newVideo = new BufferedOutputStream(new FileOutputStream("myFile\\new.mp4"));

        int i;
        while ((i = oldVideo.read()) != -1) {
            newVideo.write(i);
        }
        oldVideo.close();
        newVideo.close();
    }
}