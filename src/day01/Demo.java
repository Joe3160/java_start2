package day01;

public class Demo {
    public static void main(String[] args){
        System.out.println("Integer 的最大值 "+Integer.MAX_VALUE);
        System.out.println("Integer 的最小值 "+Integer.MIN_VALUE);
        try {
            int i =Integer.parseInt("a100");
            System.out.println(i);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}
