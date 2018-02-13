package day25;

public class Demo {
    public static void main(String[] args){
        Integer i=Integer.valueOf(10);
        GenChild<Integer> genChild=new GenChild<Integer>(i);

        System.out.println("------------------------------");
        String str=new String("Hello World");
        GenChild<String> genChild1=new GenChild<String>(str);

    }
}
