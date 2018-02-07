package day17;

import java.io.*;

public class Demo {
    public static void main(String[] args) {
        FileReader fr = null;
        FileWriter fw = null;

        BufferedReader br = null;
        BufferedWriter bw = null;

        try {
            fr = new FileReader("E:\\Projects\\java_start2\\src\\day17\\Demo.java");
            fw = new FileWriter("E:\\Projects\\java_start2\\out.txt");

            br = new BufferedReader(fr);
            bw = new BufferedWriter(fw);

            int c = 0;
            while ((c = br.read()) != -1) {
                bw.write(c);
            }
            //bw.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bw != null) {
                    bw.close();
                }
                if (br != null) {
                    br.close();
                }
                if (fw != null) {
                    fw.close();
                }
                if (fr != null) {
                    fr.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
