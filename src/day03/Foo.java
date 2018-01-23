package day03;

import java.util.Scanner;

public class Foo {
    public static void main(String[] args) {

        System.out.println("请输入1-100之间的整数：");

        int num = (int) (Math.random() * 100 + 1);
        boolean flag = true;
        for (int i = 20; i >=0 ; i--) {
            System.out.println("你还可以"+(i+1)+"次机会：");
            try {
                Scanner sc = new Scanner(System.in);
                int input = sc.nextInt();
                if (input > num) {
                    System.out.println("大了");
                } else if (input < num) {
                    System.out.println("小了");
                } else {
                    sc.close();
                    System.out.println("恭喜你，输入正确！");
                    //flag=false;
                    break;
                }
            } catch (Exception e) {
                System.out.println("输入有误，请输入1-100之间的整数：");
                continue;
            }
            if (i == 0) {
                System.out.println("Game over，你输了");
            }
        }
    }
}
