#### 第9节 字节数组输入流

##### `ByteArrayInputStream`


- `FileInputStream` 的输入源是文件
- `ByteArrayInputStream` 的输入源是字节数组

- `reset()`:重置到`mark`标记位置，如果没有调用过`mark()`方法则重置到缓冲区的起始位置
- `mark(int)`