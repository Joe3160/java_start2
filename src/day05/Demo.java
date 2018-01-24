package day05;

import java.util.Date;

public class Demo {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);

        long l = System.currentTimeMillis();//当前时间时间的毫秒数
        System.out.println(l);
        Date date1 = new Date(l);
        Date date2 = new Date(l + 30000);
        System.out.println(date1.before(date2));//测试此日期是否在指定日期之前。
        System.out.println(date1.after(date2));//测试此日期是否在指定日期之后。
        System.out.println(date1.compareTo(date2));//比较两个时期,0:相等，-1 date1在date2之前，1 date1在date2之后

    }
}
