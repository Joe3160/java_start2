package day25;

public class GenChild<T> extends GenParent<T> {
    public GenChild(T t) {
        super(t);
        System.out.println("泛型子类的有参构造器");
    }
}
