package day23;

public class Demo {
    public static void main(String[] args) {
        Integer[] is1 = {2, 4, 6, 8};
        Integer[] is2 = {2, 4, 6, 8, 10};
        Double[] ds = {2.0, 4.0, 6.0, 8.0};
        Average<Integer> a1 = new Average<Integer>(is1);
        Average<Integer> a2 = new Average<Integer>(is2);
        Average<Double>  a3=new Average<Double>(ds);

        boolean flag = a1.equalAvg(a2);
        System.out.println(flag);

        //boolean flag2=a1.equalAvg(ds);
    }

}
