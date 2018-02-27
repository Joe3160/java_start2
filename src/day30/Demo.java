package day30;

import java.util.LinkedList;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        // add 方法
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        System.out.println(list);
        list.addLast("end");
        list.addFirst("first");
        System.out.println(list);
        list.add(6, "f");
        System.out.println(list);

        System.out.println("---------poll--------------");
        String first = list.poll();
        System.out.println(first);
        System.out.println(list);

        System.out.println("-----------peek----------");
        String first2 = list.peek();
        System.out.println(first2);
        System.out.println(list);

        System.out.println("-------pop------");
        String pop = list.pop();
        System.out.println(pop);
        System.out.println(list);

        //LinkedList转组
        System.out.println("--------toArray-------");
        String[] arr = new String[list.size()];
        list.toArray(arr);

        for (String ss : arr) {
            System.out.print(ss + ",");
        }
        //有参数的构造方法
        LinkedList<String> list2 = new LinkedList<String>(list);
        System.out.println(list2);




    }
}
