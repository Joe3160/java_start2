package day24;

public class GenMethod {

    public static <T> boolean have(T[] ts, T t) {
        boolean flag = false;
        for (int i = 0; i < ts.length; i++) {
            if (t.equals(ts[i])) {
                flag = true;
                break;
            }
        }
        return flag;

    }
}
