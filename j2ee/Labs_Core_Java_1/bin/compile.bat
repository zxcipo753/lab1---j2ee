set JAVA_HOME=C:\Users\QianPeng\Documents\Java\jdk1.5.0_06
set PATH=%JAVA_HOME%\bin;%PATH%
set LIB=..\classes
javac -d ..\classes -classpath %LIB% ..\src\*.java
