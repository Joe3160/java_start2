package day15;

import java.io.FileWriter;
import java.io.IOException;

public class Demo {
    public static void main(String[] args) {
        //char c='中';
        //System.out.println((int) c);
        FileWriter fw = null;
        try {
            fw = new FileWriter("day15.out.txt");
            String str = "你好啊，世界！2010";
            for (int i = 0; i < str.length(); i++) {
                fw.write(str.charAt(i));
            }
            fw.flush();//最好手动调用，在没有调用fw.close()方法的时候一定要调用。
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
