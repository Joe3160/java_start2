package day29;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        ArrayList<String> all = new ArrayList<String>();
        all.add("a");
        all.add("b");
        all.add("c");
        all.add("d");
        all.add("e");
        System.out.println("all 的长度是:" + all.size());
        System.out.println("all 的内容：" + all);

        all.add(0, "One");
        System.out.println(all);

        all.set(0, "first");
        System.out.println(all);

        all.remove("first");
        System.out.println(all);
        all.remove(0);
        System.out.println(all);

        for (String s : all) {
            System.out.print(s + ",");
        }
        System.out.println();
        System.out.println("-------------");
        for (int i = 0; i < all.size(); i++) {
            System.out.print(all.get(i) + ",");
        }

        //ArrayList和数组的交互
        String[] s1 = new String[all.size()];
        s1 = all.toArray(s1);
        System.out.println();
        for (String s : s1) {
            System.out.print(s + ",");
        }

        //构造ArrayList时间候传值
        System.out.println();
        System.out.println("---------");
        ArrayList<String> all2 = new ArrayList<String>(all);
        System.out.println(all2);
        System.out.println(all2.equals(all));

        //在构造的时候指定容量
        ArrayList<String> all3 = new ArrayList<String>(3);
        all3.addAll(all);
        System.out.println("***********");
        System.out.println(all3);

    }
}
