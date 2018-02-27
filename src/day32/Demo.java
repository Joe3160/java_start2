package day32;

public class Demo {
    public static void main(String[] args){
        //java.util.ArrayList list=new java.util.ArrayList();
        ArrayList list=new ArrayList();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        System.out.println(list);
        list.remove(3);
        System.out.println(list);
        list.set(0,"first");
        System.out.println(list);
        System.out.println(list.get(2));

    }
}
