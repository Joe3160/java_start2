package day19;

public class Demo {
    public static void main(String[] args) {
        Integer i1=Integer.valueOf(30);
        NoGen g1=new NoGen(i1);
        g1.showType();

        Integer i2=(Integer) g1.getObj();
        System.out.println(i2);

        System.out.println("-------------");

        String s1=new String("hello");
        NoGen g2=new NoGen(s1);
        g2.showType();
        String s2=(String) g2.getObj();
        System.out.println(s2);



    }

}
