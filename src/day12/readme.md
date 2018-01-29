#### 第12节 字符输入流

##### `InputStreamReader`
字节流通往字符流的桥梁

    FileInputStream fis = null;
    InputStreamReader isr = null;
    fis = new FileInputStream(filePath);
    isr = new InputStreamReader(fis,"UTF-8");