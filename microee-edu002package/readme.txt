### 新建目录作为项目根目录
microee-edu002package

### 标准目录结构
mkdir -p /src/main/java 		# java源文件目录
mkdir -p /src/main/resources 	# java资源文件目录
mkdir -p /target/classes 		# 目标文件夹

### 根据源代码功能建立 package
com.microee.edu002package
$ midir -p ./src/main/java/com/microee/edu002package

### 建立第一个java源文件 Hello.java
package com.microee.edu002package;

public class Hello {
	public static void main (String[] args) {
		System.out.println("Hello world");
	}	
}

### 编译源文件 
$ javac -d target/classes src/main/java/com/microee/edu002package/Hello.java

### 运行程序
$ cd ./target/classes && java com.microee.edu002package.Hello && cd ../..
