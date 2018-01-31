package day12;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo {
    public static void main(String[] args) {
        //System.out.println(System.getProperty("file.encoding"));//编码
        //System.out.println("你好".getBytes().length);
        FileInputStream fis = null;
        InputStreamReader isr = null;
        String filePath = "E:\\Projects\\java_start2\\src\\day12\\in.txt";
        try {
            fis = new FileInputStream(filePath);
            isr = new InputStreamReader(fis, "UTF-8");
            int c = 0;
            //fis.read():每次读取一个字节,
            //isr.read():每次读取的字节数由编码集决定的
            c = isr.read();
            while (c != -1) {
                System.out.print((char) c);
                c = isr.read();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭流   
            try {
                //关闭流要从里到外
                isr.close();
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
