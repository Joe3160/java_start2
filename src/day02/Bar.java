package day02;

public class Bar {
    private int id;
    public Bar(int id){
        this.id=id;
    }
    @Override
    protected void finalize() throws Throwable {
        System.out.println(id+"正在被执行finalize方法");
    }
}
