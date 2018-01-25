package day07;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo {
    public static void main(String[] args) {
        FileInputStream fis = null;
        int i = 0;
        try {
            fis = new FileInputStream("E:\\Projects\\java_start2\\src\\day07\\1.txt");
            try {
                i = fis.read();
                while (i != -1) {//还没有到文件结尾
                    System.out.println("原码："+i);
                    System.out.println((char)i);
                    i=fis.read();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
