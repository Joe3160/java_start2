package day22;

public class Average<T extends Number> {
    private T[] ts;

    public Average(T[] obj) {
        this.ts = obj;
    }

    public int average() {
        double sum = 0;
        for (int i = 0; i < ts.length; i++) {
            sum += ts[i].doubleValue();
        }
        return (int) (sum / ts.length);
    }
}
