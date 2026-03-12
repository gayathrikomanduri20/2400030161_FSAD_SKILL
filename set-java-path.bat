@echo off
set JAVA_HOME=C:\Program Files\Eclipse Adoptium\jdk-17.0.18.8-hotspot
set PATH=%JAVA_HOME%\bin;%PATH%
echo JAVA_HOME set to: %JAVA_HOME%
echo.
javac -version
echo.
echo Now run: mvn clean install
cmd /k
