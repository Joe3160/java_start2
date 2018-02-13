package day24;

import common.helper;

public class Demo {
    public static void main(String[] args){
        Integer[] is={1,3,5,7,9};
        boolean flag=GenMethod.have(is,6);
        helper.dump(flag);

        String[] str={"a","b","c","d"};
        boolean flag2=GenMethod.have(str,"d");
        helper.dump(flag2);
        helper.dump(str);


    }
}
