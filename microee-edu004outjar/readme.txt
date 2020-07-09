
### 编译包含第三方jar的源文件
$ javac -classpath libs/edu003.jar -d target/classes src/main/java/**/*.java

### 创建清单 
# src/main/resources/MANIFEST.mf
Manifest-Version: 1.0
Main-Class: com.microee.jar.Hello
Class-Path: libs/edu003.jar

### 打成jar包
$ cd target/classes
$ jar -cvfm ../edu004.jar ../../src/main/resources/MANIFEST.md com