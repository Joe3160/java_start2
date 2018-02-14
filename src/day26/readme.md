#### 第26节 泛型类与非泛型类之间的继承

#####  1. 父类是泛型类，子类不是泛型类

```java
public class Child<T> extends GenParent<T> {
    
}
```
如果子类继承了带泛型的父类，子类也必须是泛型类，并且包含父类的泛型

#####  2.子类不是泛型类，父类是泛型类

```java
public class GenChild<T> extends Parent {
}
```