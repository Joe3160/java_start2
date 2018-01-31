package day14;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Demo {
    public static void main(String[] args) {
        FileReader fr = null;
        String filePath = "E:\\Projects\\java_start2\\src\\day14\\1.txt";
        try {
            fr = new FileReader(filePath);
            int c = 0;
            c = fr.read();
            while (c != -1) {
                System.out.print((char) c);
                c=fr.read();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
