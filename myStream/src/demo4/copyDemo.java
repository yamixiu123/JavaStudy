package demo4;

import java.io.*;

//D:\project\test
public class copyDemo {
    public static void main(String[] args) throws IOException {
        File srcFolder = new File("D:\\project\\test");
        String srcFolderName = srcFolder.getName();
        //System.out.println(fileName);
        File destFolder = new File("myStream", srcFolderName);

        if (!destFolder.exists()) {
            destFolder.mkdir();
        }

        File[] srcFiles = srcFolder.listFiles();
        for (File srcFile : srcFiles) {
            String fileName = srcFile.getName();
            File destFile = new File(destFolder, fileName);

            copyFile(srcFile, destFile);


        }
    }

    private static void copyFile(File srcFile, File destFile) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcFile));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFile));
        byte[] bytes = new byte[1024];
        int len;
        while ((len = bis.read(bytes)) != -1) {
            bos.write(bytes, 0, len);
            bos.flush();
        }
        bis.close();
        bos.close();
    }
}
