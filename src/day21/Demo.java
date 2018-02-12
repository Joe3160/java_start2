package day21;

public class Demo {
    public static void main(String[] args) {
        Integer i1 = Integer.valueOf(100);
        Integer i2 = Integer.valueOf(101);

        String s1 = new String("Hello");
        String s2 = new String("World");

        // 声明第一个泛型对象
        TwoGen<Integer,Integer> t1=new TwoGen<Integer, Integer>(i1,i2);
        System.out.println(t1.getObj1());
        System.out.println(t1.getObj2());
        t1.showType();

        System.out.println("----------------------");
        TwoGen<String,String> t2=new TwoGen<String, String>(s1,s2);
        System.out.println(t2.getObj1());
        System.out.println(t2.getObj2());
        t2.showType();

        //声明第三个泛型
        System.out.println("--------------------------");
        TwoGen<Integer,String> t3=new TwoGen<Integer, String>(i1,s1);
        System.out.println(t3.getObj1());
        System.out.println(t3.getObj2());
        t3.showType();

    }
}
