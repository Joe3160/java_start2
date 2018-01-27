package day11;

import java.io.*;

public class Demo {
    public static void main(String[] args) {
        String filePath = "E:\\Projects\\java_start2\\src\\day11";
        FileInputStream fis = null;
        BufferedInputStream bis = null;
        FileOutputStream fos = null;
        BufferedOutputStream bos = null;
        try {
            //输入流
            fis = new FileInputStream(filePath + "\\in.txt");
            bis = new BufferedInputStream(fis);
            //输出流
            fos = new FileOutputStream(filePath + "\\out.txt");
            bos = new BufferedOutputStream(fos);

            //读取文件流
            int c = 0;
            c = bis.read();
            while (c != -1) {
                bos.write(c);//取读到数据写缓存里
                //System.out.println((char)c);
                c = bis.read();//读取下个字节,注：一个中文三个字节
            }
            //bos.flush();//强制将缓冲充区数据写到文件，不用等到缓冲区写满再写入
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bis != null) {
                    bis.close();
                }
                if (bos != null) {
                    bos.close();
                }
                if (fis != null) {
                    fis.close();
                }
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
