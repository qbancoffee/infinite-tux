echo off

IF EXIST .\infinitetux goto deleteimb
mkdir infinitetux

javac --release 8 -d .\infinitetux .\src\main\java\com\mojang\mario\*.java .\src\main\java\com\mojang\mario\level\*.java .\src\main\java\com\mojang\mario\mapedit\*.java .\src\main\java\com\mojang\mario\sprites\*.java .\src\main\java\com\mojang\sonar\*.java .\src\main\java\com\mojang\sonar\mixer\*.java .\src\main\java\com\mojang\sonar\sample\*.java
xcopy src\main\resources\*  infinitetux /E/Y

jar cfm infinitetux.jar manifest.txt -C .\infinitetux . 


IF EXIST .\dist goto deletedist

:deletedist
del /q /s .\dist  > nul
rmdir /q /s .\dist  > nul
:exit

:deleteimb
del /q /s .\infinitetux > nul
rmdir /q /s .\infinitetux > nul
:exit

mkdir .\dist
move /y infinitetux.jar .\dist > nul
del /s /q .\infinitetux  > nul
rmdir /s /q .\infinitetux  > nul


