package day18;

import java.io.Serializable;

public class User implements Serializable {
    private String name;
    private int id;
    private String gender;
    private transient String addr;//transient定义保密，保存对象时不保存敏感信息

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    @Override
    public String toString() {
        return "User(id="+id+",name="+name+",gender="+gender+",addr="+addr+")";
    }
}
