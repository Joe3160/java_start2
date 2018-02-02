package day16;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Demo {
    public static void main(String[] args)  {
        FileReader fr = null;
        BufferedReader br = null;
        try {
            fr = new FileReader("E:\\Projects\\java_start2\\src\\day16\\1.txt");
            br = new BufferedReader(fr);

            //标记流中的当前位置。
            //对reset() 的后续调用将尝试将该流重新定位到此点。
            br.mark(1000);

            //第一种方法:read()逐个读取字符
            int c = 0;//因为读取的是整形数据
            c = br.read();
            while (c != -1) {
                System.out.print((char) c);
                c = br.read();
            }

            System.out.println("----------------------------");

            //第二种，按行读取readLine()
            br.reset();//重置文件，因为经过上的方法，文件指针到了文件结尾
            String str=br.readLine();
            while (str!=null) {
                System.out.println(str);
                str=br.readLine();
            }





        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
