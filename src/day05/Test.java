package day05;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
    public static void main(String[] args) {
        Date date=new Date();
        //通过抽象类的静态方法获得实例
        DateFormat df1=DateFormat.getInstance();
        //new子类获得实例
        DateFormat df2=new SimpleDateFormat("y");//四位数
        DateFormat df3=new SimpleDateFormat("yy");//两位数
        DateFormat df4=new SimpleDateFormat("yyyy");//四位数
        DateFormat df5=new SimpleDateFormat("M");//一位数
        DateFormat df6=new SimpleDateFormat("MM");//两位数(两位数)
        DateFormat df7=new SimpleDateFormat("D");//年中的天数(1位或两位)
        DateFormat df8=new SimpleDateFormat("DD");//年中的天数(两位数)
        DateFormat df9=new SimpleDateFormat("H");//一天中的小时数（0-23）
        DateFormat df10=new SimpleDateFormat("HH");//一天中的小时数（0-23）
        DateFormat df11=new SimpleDateFormat("F");//一个月有多少个星期
        DateFormat df12=new SimpleDateFormat("E");
        DateFormat df13=new SimpleDateFormat("a");

        System.out.println("Y或y       获得年份(4位数字)   ："+df2.format(date));//2018
        System.out.println("YY或yy     获得年份(2位数字)   ："+df3.format(date));//18
        System.out.println("YYYY或yyyy 获得年份(4位数字)   ："+df4.format(date));//2018
        System.out.println("M          获得月份(1或2位数字)："+df5.format(date));//1
        System.out.println("MM         获得月份(2位数字)   ："+df6.format(date));//01
        System.out.println("D          获得天数(1或2位数字)："+df7.format(date));//1
        System.out.println("DD         获得天数(2位数字)   ："+df8.format(date));//01
        System.out.println("H          获得天数(1或2位数字) ："+df9.format(date));//1
        System.out.println("HH         获得天数(2位数字)    ："+df10.format(date));//01
        System.out.println("F          一个月有多少个星期   ："+df11.format(date));
        System.out.println("E          星期                ："+df12.format(date));
        System.out.println("a          Am/pm 标记         ："+df13.format(date));


    }
}
