package common;

public class helper {


    public static <T> void dump(T var) {
        if (var instanceof Integer) {
            System.out.println("(int)" + var);
        } else if (var instanceof Short) {
            System.out.println("(short)" + var);
        } else if (var instanceof Byte) {
            System.out.println("(byte)" + var);
        } else if (var instanceof Character) {
            System.out.println("(char)\'" + var + "\'");
        } else if (var instanceof Boolean) {
            System.out.println("(bool)" + var);
        } else if (var instanceof Float) {
            System.out.println("(float)" + var);
        } else if (var instanceof Double) {
            System.out.println("(double)" + var);
        } else if (var instanceof String) {
            System.out.println("(str)\"" + var + "\"");
        } else if (var.getClass().isArray()) {


        }

    }

    public static <Arr> void dump(Arr[] arr) {
        System.out.println("array(" + arr.length + "){");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getClass().isArray()) {
                System.out.println(i + "=>[");
                System.out.print("  ");
                dump(arr[i]);
                System.out.println("]");
            } else {
                if (arr[i] instanceof Integer) {
                    System.out.println("    " + i + "=>(int)" + arr[i]);
                } else if (arr[i] instanceof Short) {
                    System.out.println("    " + i + "=>(short)" + arr[i]);
                } else if (arr[i] instanceof Byte) {
                    System.out.println("    " + i + "=>(Byte)" + arr[i]);
                } else if (arr[i] instanceof Character) {
                    System.out.println("    " + i + "=>(char)\'" + arr[i] + "\'");
                } else if (arr[i] instanceof Boolean) {
                    System.out.println("    " + i + "=>(bool)" + arr[i]);
                } else if (arr[i] instanceof Float) {
                    System.out.println("    " + i + "=>(float)" + arr[i]);
                } else if (arr[i] instanceof Double) {
                    System.out.println("    " + i + "=>(double)" + arr[i]);
                } else if (arr[i] instanceof String) {
                    System.out.println("    " + i + "=>(str)\"" + arr[i] + "\"");
                }
            }


            //System.out.println("    "+i+"=>"+arr[i]);
        }
        System.out.println("}");
    }

}
