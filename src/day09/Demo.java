package day09;

import java.io.ByteArrayInputStream;

public class Demo {
    public static void main(String[] args) {
        String str = "abcdefghijlmnopqrstuvwxyz";
        byte[] b = str.getBytes();
        ByteArrayInputStream bis = new ByteArrayInputStream(b);
        for (int i = 0; i < 2; i++) {
            int c = bis.read();
            while (c != -1) {
                if (i == 0) {
                    //abcdefghijlmnopqrstuvwxyz
                    System.out.print((char) c);
                } else {
                    //ABCDEFGHIJLMNOPQRSTUVWXYZ
                    System.out.print(Character.toUpperCase((char) c));
                }
                c = bis.read();//读取下一个字符
            }
            System.out.println("");
            bis.reset();//重置标记位置。
        }


    }
}
