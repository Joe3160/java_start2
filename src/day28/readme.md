#### 第28节  集合框架概述


##### 1. 什么是集合框架

Java的集合框架是`java.util`包中提供的一系列工具，它为程序处理对象组提供了
标准的方式。诞生自1.2版本。

> 1.2版本之前，我们如何处理对象组？
-  数组 

    缺点：长度固定、数组中只能存放一种类型的数据。
-  `Vector`、`Stack`、`Properties`

    缺点：缺乏统一的操作方式。不易扩展。

>1.2版本之后，诞生了集合框架
优点：性能提高。
操作统一。`Collection` `List` `Set`
提高了扩展性。
集合实现了`Iterator`接口。
迭代器：提供了访问元素的统一方法。
集合存储的是一组单个的数据  `Collection`
Map存储的是一组成对的数据

###### 2.常用接口以及实现类介绍

`Collection`是所有集合的父接口，不包含`Map`
`Set` 继承自`Collection`，不允许出现相同的元素。
`List` 继承自`Collection`，以列表形式存储的集合。

