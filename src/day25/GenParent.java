package day25;

public class GenParent<T> {
    private T t;

    public GenParent() {
        System.out.println("泛型父类的无参构造器");
    }

    public GenParent(T t) {
        this.t = t;
        System.out.println("泛型父类的有参构造器");
        System.out.println("T的类型:"+t.getClass().getName());
    }
}
