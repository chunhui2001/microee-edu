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
