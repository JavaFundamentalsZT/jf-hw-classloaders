Java Fundamentals 2012 - Homework 7
===========

Description
----------

Here we've implemented a very simple plugin system. We have a Plugin interface
that defines that every plugin has a Name, URL and a logo. The plugins are defined
in the folder plugins. Each plugin has a README.properties (that defines plugin information)
and the corresponding class file in that folder. Our custom class loader picks that 
class up and instantiates. We call these plugins our local plugins.

Your task
----------

Write a custom class loader and all necessary logic to support remote plugins. Remote plugins
adhere to the same interface but they are accessible from the interwebs.

The plugins are hosted at https://github.com/zeroturnaround/jf-2012-hw7/tree/master/plugins-remote You can
hardcode the locations of the plugins into your application but make sure that your program reads the PNG files
from the internets and not from local disk (it is okay if your program writes intermediate info on disk).

The plugins are hidden inside PNG files and your task is to find, extract and define classes from the plugins. Once
you've implemented your solution the org.zeroturnaround.jf2012.hw7.Main program should run without any errors and
print out all remote plugins. We've also provided quite empty implementations of RemotePluginManager and
RemotePluginLoader.

Happy hacking!