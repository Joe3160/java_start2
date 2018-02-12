package day21;

public class TwoGen<One, Two> {//两个类型参数
    private One obj1;//类型One的参数
    private Two obj2;//型型Two的参数

    public TwoGen(One obj1, Two obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    public One getObj1() {
        return obj1;
    }

    public Two getObj2() {
        return obj2;
    }

    public void showType() {
        System.out.println("One的类型是：" + obj1.getClass().getName());
        System.out.println("Two的类型是：" + obj2.getClass().getName());
    }
}
