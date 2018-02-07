#### 第18节 对象序列化

###### 为什么要序列化：
- 对象持入化，比如保存到硬盘文件中。
- 在网络中传输

######  怎么序列化
1. `Serializable` 接口
2. 对象输入/输出流：`ObjectInputStream`/`ObjectOutputStream`

```
ObjectInputStream
(Teacher) ois.readObject();
(Student) ois.readObject();

ObjectOutputStream
oos.writeObject(Teacher); 
oos.writeObject(Student); 

```
    
3. `transient`关键字