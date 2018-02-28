package day33;


public class Demo {
    public static void main(String[] args) {
        //java.util.LinkedList list = new java.util.LinkedList();
        LinkedList list = new LinkedList();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
    }
}
