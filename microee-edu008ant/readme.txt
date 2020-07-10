Download one-jar-ant-task-0.97.jar
Unpack into a working directory (e.g. c:/one-jar-ant):

$ mkdir c:/one-jar-ant
$ cd c:/one-jar-ant
$ jar -xvf .../one-jar-ant-task-0.97.jar
Add the following to your build.xml script:

<property name="one-jar.dist.dir" value="c:/one-jar-ant"/>
<import file="${one-jar.dist.dir}/one-jar-ant-task.xml" optional="true" />
<one-jar destfile="your.one.jar"
...etc.


http://one-jar.sourceforge.net/index.php?page=getting-started&file=ant

### Ant – Create a fat jar file
https://mkyong.com/ant/ant-create-a-fat-jar-file/

### 簡介 Apache Ivy
https://openhome.cc/Gossip/JUnit/Ivy.html