Infinite Tux For Windows, Linux, and OSX
=========================================
This is a great mario game clone for Windows, Linux, and OSX that will bring tons of fun to your day! Thank you Chris Lewis for putting this out there!<br>
I've replaced all of the proprietary artwork with stuff I created or downloaded and I've added a full screen mode and the ability to exit the game by hitting escape.<br>
Also added some scripts to help compile the game.

Now it's completely open source!

Make sure you have a Java version of at least 1.8.

<br>

Gameplay Video
--------------

[![Gameplay Video](https://img.youtube.com/vi/CxtxaujNFws/0.jpg)](https://www.youtube.com/watch?v=CxtxaujNFws)

<br>

AI Gameplay Video
--------------

[![AI Gameplay Video](https://img.youtube.com/vi/eiG-bJdwCyc/0.jpg)](https://www.youtube.com/watch?v=eiG-bJdwCyc)

[![AI Gameplay Video over ground](https://img.youtube.com/vi/5RukWnRZ0yI/0.jpg)](https://www.youtube.com/watch?v=5RukWnRZ0yI)
<br>


ScreenShots
-----------

![[Infinite Tux Title Screen](/screenshots/tux_title.png?raw=true "Infinite Tux Title Screen")

![Infinite Tux World Map](/screenshots/tux_map.png?raw=true "Infinite Tux World Map")

![Infinite Tux Above Ground 1](/screenshots/tux_jump_shark.png?raw=true "Infinite Tux Above Ground 1")

![Infinite Tux Above Ground 2](/screenshots/tux_fire_shark.png?raw=true "Infinite Tux Above Ground 2")

![Infinite Tux Dungeon](/screenshots/tux_dungeon_jump.png?raw=true "Infinite Tux Dungeon")

![Infinite Tux Castle](/screenshots/tux_castle_cannon.png?raw=true "Infinite Tux Castle")




<br>

Compiling and running
---------------------
The following was tested on Ubuntu 16.04 and 18.04. At a minimum you'll need a JDK of at least 1.8.<br>
on Ubuntu you can install 1.8 like this. 

You can compile via any of the following methods.
* makeit
* makeit.bat(for windows)
* debuild
```bash
sudo apt-get install openjdk-8-jdk
```

You could also start the game by running a starter script created in the dist folder.

```bash
cd dist
./infinitetux
```

or you could run it full screen 

```bash
./infinitetux  f
```
to exit just hit escape.<br>


or

```bash
java -jar infinitetux.jar
```
or

```bash
java -cp .:infinitetux.jar com.mojang.mario.FullScreenFrameLauncher
```


* With java jdk

If you only wish to install the minimum, then all you need is a JDK to compile and run it.<br>
On windows make sure the jdk is in your path.

Under linux and Mac you should only need the makeit script. If the script isn't executable, do the following.<br>
Make executable.
```bash
chmod +x makeit
```
Compile 
```bash
./makeit
cd dist
```
Run
```bash
infinitetux
```
or 
```bash
infinitetux f
```

or

```bash
java -jar infinitetux.jar
```
or

```bash
java -cp .:infinitetux.jar com.mojang.mario.FullScreenFrameLauncher
```

On windows you should just have to double click on the makeit.bat file. I think you could double click on the
jar file and it will start. You can always issue the commands from the command prompt. I still need to make a batch script that
will run the game in full screen mode.

Compile 
```windows
makeit
```
Run
```windows
java -jar infinitetux.jar
```
or

```windows
java -cp .;infinitetux.jar com.mojang.mario.FullScreenFrameLauncher
```



