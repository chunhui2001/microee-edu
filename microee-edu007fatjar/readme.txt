### 项目结构
.
├── libs
│   └── edu003.jar
├── src
│   └── main
│       ├── java
│       │   └── com
│       │       └── edu007fatjar
│       │           └── App.java
│       └── resources
│           └── META-INF
│               └── MANIFEST.md
└── target
    ├── classes
    │   └── com
    │       └── edu007fatjar
    │           └── App.class
    └── edu007.jar

>>> 如果想使用 edu003.jar 中的类, 需将 edu003.jar 解压后的所有内容放到 target/classes 目录下, 然后执行 javac 命令编译源文件
$ cp libs/edu003.jar target/classes && cd target/classes && tar xf edu003.jar && rm -rf META-INF edu003.jar 

### 参考
# Create an Executable Fat JAR With Your Command Line
https://dzone.com/articles/java-8-how-to-create-executable-fatjar-without-ide

