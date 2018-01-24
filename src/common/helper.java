package common;

public class helper {

    public static void dump(){
        System.out.println("");
    }

    public static void dump(int[] arr){
        System.out.println("int array:"+arr.length+"(");
        for (int i=0;i<arr.length;i++) {
            System.out.println("    "+i+"=>"+arr[i]+",");
        }
        System.out.println(")");
    }

    public static void dump(int[][] arr){
        System.out.println("int[][]array:"+arr.length+"(");
        for (int i=0;i<arr.length;i++) {
            System.out.printf("  ");
            System.out.println("int[]array:"+arr[i].length+"(");
            for (int j=0;j<arr[i].length;j++) {
                System.out.println("    "+i+"=>"+arr[i][j]+",");
            }
            System.out.println("  ),");
        }
        System.out.println(")");
    }





    public static void dump(char var_char){

        System.out.println("char("+var_char+")");
    }
    public static void dump(byte var_byte){

        System.out.println("byte("+var_byte+")");
    }

    public static void dump(short var_short){

        System.out.println("short("+var_short+")");
    }
    public static void dump(int var){

        System.out.println("int("+var+")");
    }
    public static void dump(float var_float){

        System.out.println("float("+var_float+")");
    }

    public static void dump(double var_double){
        System.out.println("double("+var_double+")");
    }

    public static void dump(boolean bool){

        System.out.println("boolean("+bool+")");
    }

    public static void dump(String str){
        System.out.println("String("+str.length()+")"+"\""+str+"\"");
    }
}
