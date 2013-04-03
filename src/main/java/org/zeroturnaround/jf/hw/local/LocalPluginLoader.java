package org.zeroturnaround.jf.hw.local;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class LocalPluginLoader extends ClassLoader {
  private final File pluginLocation;

  public LocalPluginLoader(String pluginName) {
    this.pluginLocation = new File("plugins", pluginName);
  }

  @Override
  public Class<?> loadClass(String name) throws ClassNotFoundException {
    Class clazz;
    try {
      clazz = getParent().loadClass(name);
      return clazz;
    }
    catch (ClassNotFoundException e) {
    }

    String classFileLocation = name.substring(name.lastIndexOf(".") + 1) + ".class";
    Path path = FileSystems.getDefault().getPath(pluginLocation.getAbsolutePath(), classFileLocation);

    if (!path.toFile().exists()) {
      System.out.println("Unable to find class " + path);
      throw new ClassNotFoundException(name);
    }

    byte[] bytes = null;
    try {
      bytes = Files.readAllBytes(path);
    }
    catch (IOException e) {
      throw new RuntimeException(e);
    }

    return defineClass(name, bytes, 0, bytes.length);
  }
}
