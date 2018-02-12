package day20;

public class Test {
    public static void main(String[] args) {
        Integer i1 = Integer.valueOf(100);
        String s1 = new String("Hello world");
        Demo<Integer> d1 = new Demo<Integer>(i1);
        d1.showType();
        Integer i2=d1.getObj();
        System.out.println(i2);

        System.out.println("----------------");

        Demo<String> d2 = new Demo<String>(s1);
        d2.showType();
        String s2=d2.getObj();
        System.out.println(s2);

    }
}
