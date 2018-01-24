package day04;

public class Demo {

    public static void main(String[] args) {
        //构造一个不带字符，但具有指定初始容量的字符串缓冲区。
        StringBuffer sb = new StringBuffer();
        //返回当前容量。容量指可用于最新插入的字符的存储量，超过这一容量就需要再次进行分配。
        int capacity = sb.capacity();//16
        System.out.println(capacity);
        //构造一个字符串缓冲区，并将其内容初始化为指定的字符串内容。
        //该字符串的初始容量为 16 加上字符串参数的长度。
        StringBuffer sb2 = new StringBuffer("Hello World");
        int capacity2 = sb2.capacity();//16+11
        System.out.println(capacity2);
        //构造一个字符串缓冲区，并将其内容初始化为指定的字符串内容。
        StringBuffer sb3 = new StringBuffer(100);
        System.out.println(sb3.capacity());//100

        StringBuffer sb4 = new StringBuffer("Hello");
        sb4.append(",");
        sb4.append("World");
        sb4.append("\n");
        sb4.append("Welcome!");
        System.out.println(sb4);//sb4.toString();

        StringBuffer sb5 = new StringBuffer("Hello");
        System.out.println(toLowerCase(sb5));
        System.out.println(toUpperCase(sb5));


    }

    public static StringBuffer toLowerCase(StringBuffer sb) {
        StringBuffer sbTemp = new StringBuffer();
        for (int i = 0; i < sb.length(); i++) {
            char c = sb.charAt(i);
            sbTemp.append(Character.toLowerCase(c));
        }
        return sbTemp;
    }

    public static StringBuffer toUpperCase(StringBuffer sb) {
        StringBuffer sbTemp = new StringBuffer();
        for (int i = 0; i < sb.length(); i++) {
            char c = sb.charAt(i);
            sbTemp.append(Character.toUpperCase(c));
        }
        return sbTemp;
    }
}
