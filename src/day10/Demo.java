package day10;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class Demo {
    public static void main(String[] args) {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        String str = "abcdefghijklmnopqrstuvwxyz";
        byte[] b = str.getBytes();
        try {
            bos.write(b);//写到缓冲区
            System.out.println(bos);//打印流
            byte[] b1 = bos.toByteArray();//获得byte数组
            for (int i = 0; i < b1.length; i++) {
                System.out.print((char) b1[i]);
                //System.out.println(b1[i] + ":" + ((char) b1[i]));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
