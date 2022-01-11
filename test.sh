#!/bin/bash

echo "Hello Travis ****************************************"
echo ""
echo "getting Liberica 17 full   **************************"
wget -O  libjava17.tar.gz https://download.bell-sw.com/java/17.0.1+12/bellsoft-jre17.0.1+12-linux-amd64-full.tar.gz
tar -xf libjava17.tar.gz
ls jre-17.0.1-full
echo ""

echo "getting Gradle7            **************************"
wget -O  gradle7.zip https://gradle.org/next-steps/?version=7.3.3&format=bin
mkdir gradle7
unzip -d gradle7 gradle7.zip
ls gradle7/gradle-7.3.3
echo ""

echo "building ET_Tripoli        **************************"
gradle7/bin/gradle clean build -Dorg.gradle.java.home=/jre-17.0.1-full/

