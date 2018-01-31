#### 第15节 ：写文件类

**_`FileWriter`_**

```java
class Demo{
    public static void main(String[] args){
      fw = new FileWriter("day15.out.txt");
      String str = "你好啊，世界！2010";
      for (int i = 0; i < str.length(); i++) {
          fw.write(str.charAt(i));
      }
    }
}
```
