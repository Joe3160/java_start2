package day18;

import java.io.*;

public class Demo {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        FileInputStream fis = null;

        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;

        try {
            String path = "E:\\Projects\\java_start2\\src\\day18\\out.txt";
            fos = new FileOutputStream(path);
            oos = new ObjectOutputStream(fos);
            User user1 = new User();//定义对象
            user1.setName("Joe");
            user1.setId(66781);
            user1.setAddr("sz");
            user1.setGender("male");
            oos.writeObject(user1);//写入对象
            System.out.println("写入对象user1成功");

            User user2 = new User();//定义对象
            user2.setName("Lily");
            user2.setId(167167);
            user2.setAddr("gz");
            user2.setGender("female");
            oos.writeObject(user2);//写入对象
            System.out.println("写入对象user2成功");
            //读对象
            fis = new FileInputStream(path);
            ois = new ObjectInputStream(fis);
            User user1_r = (User) ois.readObject();
            User user2_r = (User) ois.readObject();
            System.out.println("前:" + user1);
            System.out.println("后" + user1_r);

            System.out.println("--------");

            System.out.println("前" + user2);
            System.out.println("后" + user2_r);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (oos != null) {
                    oos.close();
                }
                if (ois != null) {
                    //ois.close();
                }
                if (fos != null) {
                    fos.close();
                }
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }


    }
}
