package day22;

public class Demo {
    public static void main(String[] args) {
        Integer[] i1={1,2,3};
        Average<Integer> aver=new Average<Integer>(i1);
        int a=aver.average();
        System.out.println(a);
    }
}
