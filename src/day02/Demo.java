package day02;

public class Demo {
    public static void main(String[] args) {
        Object obj1 = new Object();
        Object obj2 = new Object();
        System.out.println(obj1.equals(obj2));
        System.out.println("obj1的哈希码：" + obj1.hashCode());
        System.out.println("obj2的哈希码：" + obj2.hashCode());
        System.out.println("---------------------");
        Foo foo = new Foo();
        foo.setName("Joe");
        foo.setEmail("694995669@qq.com");
        foo.setId(66781);
        System.out.println(foo);
        try {
            Foo foo1 = foo.clone();
            System.out.println(foo1);
            System.out.println(foo == foo1);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        System.out.println("------垃圾回收测试-----------");
        for (int i = 0; i < 1000; i++) {
            Bar bar = new Bar(i);
            System.gc();//建议执行垃圾清理，但不保证执行，也不保证全部回收所有垃圾
        }

    }
}
