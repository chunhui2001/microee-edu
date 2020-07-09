java -Dlog4j.configurationFile=./libs/log4j2.xml -jar edu006.jar 

### 将一个文件加入到一个已存在的jar里
$ jar uvf <jar file name> <file to be added> <folder name inside jar>
$ jar uvf target/edu006.jar META-INF/log4j2.xml 