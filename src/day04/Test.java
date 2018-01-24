package day04;

import java.util.Date;

public class Test {
    public static void main(String[] args){
        System.out.println(new Date());
        //test1();//17秒
        test2();//0.1秒

        System.out.println(new Date());

    }

    public static void test1(){
        String str="";
        for (int i = 0; i <500000 ; i++) {
            str+=String.valueOf(i);
        }
    }

    public static void test2(){
        StringBuffer sb=new StringBuffer();
        for (int i = 0; i <5000000 ; i++) {
            sb.append(i);
        }


    }
}
