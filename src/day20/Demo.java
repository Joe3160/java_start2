package day20;

public class Demo<T> {//类名后带有类型参数
    T obj;

    //构造方法
    Demo(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }

    public void showType() {
        System.out.println("对象的类型是："
                + obj.getClass().getName()
        );


    }
}
