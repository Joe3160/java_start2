package day02;

public class Foo implements Cloneable {
    private String name;
    private String email;
    private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Foo[name=" + name + ",email=" + email + ",id=" + id + "]";
    }

    @Override
    protected Foo clone() throws CloneNotSupportedException {
        return (Foo) super.clone();
    }
}
