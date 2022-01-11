#!/bin/bash

echo "Hello Travis ****************************************"

wget -O  libjava17.tar.gz https://download.bell-sw.com/java/17.0.1+12/bellsoft-jre17.0.1+12-linux-amd64-full.tar.gz
tar -xf libjava17.tar.gz
ls jre-17.0.1-full

wget -O  gradle7.zip https://gradle.org/next-steps/?version=7.3.3&format=bin
mkdir gradle
unzip -d gradle gradle7.zip
ls gradle/gradle-7.3.3

gradle clean build -Dorg.gradle.java.home=/jre-17.0.1-full/

