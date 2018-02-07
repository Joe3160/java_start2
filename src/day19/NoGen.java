package day19;

public class NoGen {
    private Object obj;

    NoGen(Object obj) {
        this.obj = obj;
    }

    public Object getObj() {
        return obj;
    }

    public void showType(){
        System.out.println("对象obj的类型是:"+obj.getClass().getName());
    }
}
