|||	### 创建工程
|||	....
|||
|||	### 组织包名
|||	....
|||
|||	### 编辑源代码
|||	....

|||	### 编译源文件
|||	$ javac -d target/classes src/main/java/com/microee/edu003jar/*.java src/main/java/com/microee/edu003jar/model/*.java
|||	$ javac -d target/classes src/main/java/com/microee/edu003jar/**/*.java
|||	$ javac -d target/classes src/main/java/**/*.java

|||	### 创建清单 
|||	# src/main/resources/MANIFEST.mf
|||	Manifest-Version: 1.0
|||	Main-Class: com.microee.jar.Hello
|||	Class-Path: 
|||
|||	### 创建jar包
|||	$ cd ./target/classes 
|||	$ jar -cvfm ../edu003.jar ../../src/main/resources/MANIFEST.mf com 
|||	$ cd ../.. 2>/dev/null

|||	### 执行jar
|||	$ java -jar ./target/edu003.jar
