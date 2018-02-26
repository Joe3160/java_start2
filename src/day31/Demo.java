package day31;

import java.util.HashSet;

/**
 *
 */
public class Demo {
    public static void main(String[] args){
        HashSet<String> hs=new HashSet<String>();
        hs.add("a");
        hs.add("b");
        hs.add("c");
        hs.add("d");
        hs.add("e");
        hs.add("a");
        System.out.println(hs);

        System.out.println("-----------------");
        //与数组的交互
        String[] arr=new String[hs.size()];
        hs.toArray(arr);

        for (String s : arr) {
            System.out.print(s+" ");
        }
        System.out.println();


        System.out.println("--------------------");
        HashSet<String> hs2=new HashSet<String>();
        hs2.addAll(hs);
        System.out.println(hs2);



    }

}
