|||	### 创建工程
|||	....
|||
|||	### 组织包名
|||	....
|||
|||	### 编辑源代码
|||	....

|||	### 编译源文件
|||	$ javac -d target/classes src/main/java/**/*.java

|||	### 创建清单 
|||	# src/main/resources/META-INF/MANIFEST.mf
|||	Manifest-Version: 1.0
|||	Main-Class: com.microee.jar.Hello
|||	Class-Path: 
|||
|||	### 创建jar包
||| $ jar -cvfm target/edu003.jar ./src/main/resources/META-INF/MANIFEST.md -C target/classes .

|||	### 执行jar
|||	$ java -jar ./target/edu003.jar
