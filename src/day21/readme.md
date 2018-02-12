#### 第21节 多个泛型参数

###### 使用两个或多个泛型参数


一个参数：
```java
public class OneGen<One> {//一个类型参数
    private One obj;//类型One的参数
    public TwoGen(One obj) {
        this.obj1 = obj1;        
    }
} 

```
两个参数：
```java
public class TwoGen<One, Two> {//两个类型参数
    private One obj1;//类型One的参数
    private Two obj2;//型型Two的参数

    public TwoGen(One obj1, Two obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }
} 
```