package day06;

import java.io.File;

public class Demo {
    public static void main(String[] args) {
        //File 可以是文件或文件夹
        File file = new File("E:\\Projects\\java_start2");
        //file.exists();//文件是否存
        //file.mkdir();//创建文件
        //file.mkdirs();//会递归创建文件夹及子目录
        File[] files = file.listFiles();
        //增强的for 类似于foreach
        for (File f : files) {
            System.out.println("文件名：" + f.getName());
            System.out.println("路径：" + f.getPath());
            System.out.println("是否文件：" + f.isFile());
            System.out.println("是否文件夹：" + f.isDirectory());
            System.out.println("------------------------");
        }
    }
}
