Java Fundamentals - Classloaders Homework
===========

Description
----------

Here we've implemented a very simple plugin system. We have a *Plugin* interface
that defines that every plugin has a *name*, *URL* and a *logo*. The plugins are defined
in the folder *plugins* in the project. Each plugin has a README.properties
(that defines plugin information) and the corresponding class file in that folder.
Our custom class loader picks that class up and instantiates. We call these plugins
our *local plugins*.

Your task
----------

Write a custom classloader and all necessary logic to support *remote plugins*. Remote plugins
adhere to the same interface but they are accessible from the interwebs.

The plugins are hosted at https://github.com/zeroturnaround/jf-hw-classloaders/tree/master/plugins-remote
I have hardcoded the locations of the 3 plugins into the homework.

The plugin meta information is in the README.properties file of each plugin. The plugin class files are hidden inside PNG files in the same folder and your task is to find, extract and define classes
from those very same images.

Just to reiterate. The bytes of the classes that define the plugins are somewhere in the PNG files. Once
you've implemented your solution the *org.zeroturnaround.jf.hw.classloaders.Main* program should run without any errors and print out all remote plugins (currently only prints names and null values). We've also provided empty implementations of RemotePluginManager and RemotePluginLoader.

Make sure that your program reads the PNG files from the network and not from local disk. For example you can use the java.util.Properties to load properties from a remote properties file by using streams (java.net.URL can also help here).

Happy hacking!
