package day32;

public class ArrayList<T> {
    private Object[] objs;
    private int i = 0;//数组的下个元素的下标
    private int size = 10;//数组的长度


    public ArrayList() {
        objs = new Object[size];
    }

    public ArrayList(int size) {
        this.size = size;
    }

    public boolean add(Object obj) {
        if (i < size) {
            objs[i++] = obj;
        } else {//扩容
            Object[] objs2 = new Object[size * 2];
            System.arraycopy(objs, 0, objs2, 0, objs.length);
            objs = objs2;
            objs[i++] = obj;
        }
        return true;
    }

    public Object remove(int index) {
        Object obj = objs[index];
        objs[index] = null;
        return obj;
    }

    public Object set(int index, Object newObj) {
        Object oldObj = objs[index];
        objs[index] = newObj;
        return oldObj;
    }

    public Object get(int index) {
        return objs[index];
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("[");
        for (Object obj : objs) {
            if (obj == null) continue;
            sb.append(obj + ",");
        }
        sb.append("]");
        return sb.toString();
    }
}
