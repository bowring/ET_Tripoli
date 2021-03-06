<img src="https://github.com/CIRDLES/cirdles.github.com/blob/master/assets/icons/Tripoli2009.png" alt="ET_Tripoli Logo" width="100">

ET_Tripoli
==========

ET_Tripoli is developed using Java 17 and JavaFX 17 and designed to run in the specialized open source Java Virtual Machines (JDK/JRE) that include JavaFX (denoted by "full" or "JDK-fx") and can be found:

[Liberica JDK/JRE 17 full](https://bell-sw.com/pages/downloads/#/java-17-lts%20/%20current)

[Azul JDK-fx 17 ](https://www.azul.com/downloads/?package=jdk-fx#download-openjdk)

ET_Tripoli will not run correctly using previous versions (< 17) of the Java Virtual Machine.

Installation Instructions
------------
1) Download the most recent ET_Tripoli 'jar' file from here.
2) Download the JDK/JRE 17 for your operating system as a compressed archive and expand it anywhere you choose.  If you want to make this version the default on your operating system, there are many online tutorials to follow. The Java executable is in the "bin" folder and is named "java"  for Mac and Linux, and "java.exe" for Windows.  To run the ET_Tripoli "jar" file, open a terminal window and paste in the path to the java executable, followed by a space character and the flag "-jar" followed by a space character and the path to the ET_Tripoli "jar" file.

Windows example using Zulu from Azul assuming terminal is running in folder containing ET_Tripoli "jar":
```text
C:\MYJAVA\zulu-17.jdk\Contents\Home\bin\java.exe -jar ET_Tripoli-1.0.0.jar
```
Mac/Linux example using Zulu from Azul assuming terminal is running in folder containing ET_Tripoli "jar":
```text
/Users/yourName/Documents/MYJAVA/zulu-17.jdk/Contents/Home/bin/java -jar ET_Tripoli-1.0.0.jar
```
If you need to have a copy of ET_Tripoli that runs on a specific OS and a Java JDK or JRE that does not include JavaFX, we can provide one or provide instructions for you to build one from the source code.

***Note to Developers***

ET_Tripoli can be compiled from the source code by using [Gradle 7.3](https://gradle.org/releases/) using the same JDK/JRE 17.
```text
gradle clean build 
```
ET_Tripoli "jar" file can then be built:
```text
gradle fatappjar
```
The resulting 'jar' file will be written to "ET_Tripoli/et_tripoliApp/build/libs/"
