package demo5;

import java.io.*;

//C:\Program Files\RealVNC\VNC Server
//创建一个源目录文件下所有文件对象的file数组
//遍历该数组，若是文件夹则在目标文件夹下创建一个同名文件夹并且再次调用该方法
//如果是文件，则获取文件名并在目标文件名下创建个相同名字的文件，并且调用复制方法复制源码
public class copyDemo {
    public static void main(String[] args) throws IOException {
        File srcFile = new File("C:\\Program Files\\RealVNC\\VNC Server");
        File destFile = new File("myStream",srcFile.getName());
        destFile.mkdir();
        traversal(srcFile,destFile);
    }
    public static void traversal(File srcFile,File destFile) throws IOException {
        File[] files = srcFile.listFiles();
        for (File file:files){
            if(file.isDirectory()){
                File srcFolder = new File(srcFile,file.getName());
                File destFolder = new File(destFile,file.getName());
                destFolder.mkdir();
                traversal(srcFolder,destFolder);
            }else {
                File secDestFile = new File(destFile,file.getName());
                copy(file,secDestFile);
            }
        }
    }

    public static void copy(File srcfile, File destFile) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcfile));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFile));
        int len;
        byte []bys = new byte[1024];
        while ((len = bis.read(bys))!=-1){
            bos.write(bys,0,len);
        }
        bis.close();
        bos.close();
    }

}
