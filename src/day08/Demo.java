package day08;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo {
    public static void main(String[] args) {
        String str = "getChannel()\n" + "返回与此文件输出流有关的唯一 FileChannel 对象";
        FileOutputStream fos = null;
        FileOutputStream fos1 = null;
        File f = new File("E:/Projects/java_start2/src/day08/f.txt");
        File f1 = new File("E:/Projects/java_start2/src/day08/f1.txt");
        if (!f.exists()) {
            //f.mkdirs();//生成文件夹
            try {
                f.createNewFile();//生成文件
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (!f1.exists()) {
            try {
                f1.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            fos = new FileOutputStream(f);
            fos1 = new FileOutputStream(f1);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        byte[] b = str.getBytes();//将字符串转成byte数组方便写入

        try {
            fos.write(b);
            fos1.write(b, 0, str.length() / 2);
            //fos.write(64);
            System.out.println("写入成功");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭文件，释放资源，让其它程序可以访问
            try {
                if (fos != null) {
                    fos.close();
                }
                if (fos1 != null) {
                    fos1.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
