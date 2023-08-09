set JAVA_HOME=C:\Program Files\Java\jdk1.5.0_06
set PATH=%JAVA_HOME%\bin;%PATH%
set LIB=..\classes
javac -d ..\classes -classpath %LIB% ..\src\*.java
