package day03;

import java.sql.SQLOutput;

public class Demo {
    public static void main(String[] args) {
        System.out.println(Math.PI);
        System.out.println(Math.E);

        System.out.println(Math.abs(-3.144f));//绝对值
        System.out.println(Math.abs(-3.1415926d));
        System.out.println(Math.cbrt(1.2));//立方
        System.out.println(Math.ceil(3.115));//向上取整
        System.out.println(Math.floor(5.32));//向下取整
        System.out.println(Math.max(10.2, 7));//取最大值
        System.out.println(Math.min(12, 5.22));

        //返回第一个参数和第二个参数之间与第一个参数相邻的浮点数
        System.out.println(Math.nextAfter(13.22, 45.2));
        //返回 f 和正无穷大之间与 f 相邻的浮点值。
        System.out.println(Math.nextUp(4.22));
        //幕运算
        System.out.println(Math.pow(2, 3));
        //返回最接近参数的 long。
        System.out.println(Math.round(4.51));
        System.out.println(Math.round(4.12));
        System.out.println(Math.round(-3.12));//-3
        System.out.println(Math.round(-3.62));//-4
        System.out.println(Math.round(-3.5));//-3?
        System.out.println(Math.sqrt(1.44));//平方根

        System.out.println(Math.floor(-3.12));





    }
}
