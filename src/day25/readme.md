#### 第25节 泛型之间的继承

```java
public class GenChild<K,T,V> extends GenParent<T> {
    public GenChild(T t) {
        super(t);
        System.out.println("泛型子类的有参构造器");
    }
}
```
定义泛型子类声明中**必须**指定父类的类型参数 
即便在子类中不使用，仍然要在列表中指定它。