### 新建目录作为项目根目录
microee-edu001javac

### 标准目录结构
mkdir -p /src/main/java 		# java源文件目录
mkdir -p /src/main/resources 	# java资源文件目录
mkdir -p /target/classes 		# 目标文件夹

### 编辑源代码
public class Hello {
	public static void main (String[] args) {
		System.out.println("Hello world");
	}	
}

### 编译源文件 
$ javac -d target/classes src/main/java/Hello.java

### 运行程序
$ cd ./target/classes && java Hello && cd ../..

### 递归找文件
$ find -L . -iname "*.iml"

### 递归找文件并删除
$ find -L . -iname "*.iml" -exec rm -rf {} +
$ find -L . -iname ".DS_Store"  -exec rm -rf {} +
$ find -L . -iname ".project"  -exec rm -rf {} +
$ find -L . -iname ".settings"  -exec rm -rf {} +

### 递归找文件夹
$ find -L . -type d -iname "node_modules" -print

### java basic
https://www.ntu.edu.sg/home/ehchua/programming/java/j2_basics.html#zz-1.
