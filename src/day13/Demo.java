package day13;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Demo {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        OutputStreamWriter osw = null;
        String filePath = "E:\\Projects\\java_start2\\src\\day13\\out.txt";
        try {
            fos = new FileOutputStream(filePath);
            osw = new OutputStreamWriter(fos);
            String str = "你好，世界！Hello World 2018";
            //将字符串逐个写入文件
            for (int i = 0; i < str.length(); i++) {
                osw.write(str.charAt(i));
            }
            //osw.flush();//刷新
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭流
            try {
                if (fos != null) {
                    osw.close();
                    fos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }
}
