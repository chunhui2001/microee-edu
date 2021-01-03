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
||| $ javac -d target/classes `find src -name \*.java -print`

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

||| ### 列出jar包里的内容列表
||| $ jar tf target/edu003.jar 

### -cvfm 含义
c: indicates we want to create a new JAR file.
v: generates verbose output to standard output.
f: specifies the jarfile to be created.
m: indicates the manifest file we use. The manifest file includes name-value pairs.
-C: indicates temporary changes to the directory. Classes are added from this directory to the JAR file. 
.: The dot indicates all classes (files).


### find and print and delete
$ find . -iname N -exec rm -rf {} \; -print