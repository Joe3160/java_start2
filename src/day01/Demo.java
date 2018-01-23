package day01;

public class Demo {
    public static void main(String[] args){
        System.out.println("Integer 的最大值 "+Integer.MAX_VALUE);
        System.out.println("Integer 的最小值 "+Integer.MIN_VALUE);
        try {
            int i =Integer.parseInt("a100");
            System.out.println(i);
        } catch (NumberFormatException e) {
            //e.printStackTrace();
        }
        String str=Integer.toBinaryString(10);//转为二进制
        System.out.println(str);

        System.out.println("---------------------------");
        System.out.println("Double 最大值："+Double.MAX_VALUE);
        System.out.println("Double 最小值 "+Double.MIN_VALUE);
        double d=Double.parseDouble("456.456");//字符串转double
        System.out.println(d);

        System.out.println("---------------");
        boolean b1=new Boolean("aaa");//从java 9 开始不建议这么做
        System.out.println(b1);
        boolean b2=Boolean.parseBoolean("ddd");
        System.out.println(b2);
        boolean b3=Boolean.parseBoolean("TrUe");
        System.out.println(b3);
    }
}
