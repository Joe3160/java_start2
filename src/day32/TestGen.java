package day32;

public class TestGen {
    public static void main(String[] args) {
        Message<String> message = new Message<String>();
        message.setMsg("Hello");
        fun(message);

        System.out.println("--------------------");

        Message<Integer> message1=new Message<Integer>();
        message1.setMsg(100);
        fun(message1);


    }


    /**
     * 泛型通配符
     *
     * @param message
     */
    public static void fun(Message<?> message) {
        System.out.println(message.getMsg());
    }
}
