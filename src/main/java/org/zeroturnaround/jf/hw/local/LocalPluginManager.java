package org.zeroturnaround.jf.hw.local;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.zeroturnaround.jf.hw.Plugin;

public class LocalPluginManager {

  public static String[] findAllPlugins() {
    Set<String> rtrn = new HashSet<String>();

    File parentDir = new File("plugins");
    File[] allFiles = parentDir.listFiles();
    for (int i = 0; i < allFiles.length; i++) {
      File file = new File(allFiles[i], "README.properties");
      if (file.exists()) {
        rtrn.add(getProps(file).getProperty("name"));
      }
    }
    return rtrn.toArray(new String[] {});
  }

  public static Plugin getPluginInstance(String pluginName) {
    // find plugin meta info and extract class name
    Map<String, String> allPlugins = findAllPluginInfos();
    String className = allPlugins.get(pluginName);

    ClassLoader cl = new LocalPluginLoader(pluginName);
    Class clazz = null;

    try {
      //
      clazz = cl.loadClass(className);
    }
    catch (ClassNotFoundException e) {
      throw new RuntimeException(e);
    }

    try {
      return (Plugin) clazz.newInstance();
    }
    catch (InstantiationException e) {
      throw new RuntimeException(e);
    }
    catch (IllegalAccessException e) {
      throw new RuntimeException(e);
    }
  }

  private static Properties getProps(File file) {
    Properties props = new Properties();
    try {
      props.load(new FileReader(file));
      return props;
    }
    catch (FileNotFoundException e) {
      return null;
    }
    catch (IOException e) {
      return null;
    }
  }

  private static Map<String, String> findAllPluginInfos() {
    Map<String, String> rtrn = new HashMap<String, String>();

    File parentDir = new File("plugins");
    File[] allFiles = parentDir.listFiles();
    for (int i = 0; i < allFiles.length; i++) {
      File file = new File(allFiles[i], "README.properties");
      if (file.exists()) {
        rtrn.put(getProps(file).getProperty("name"), getProps(file).getProperty("class"));
      }
    }
    return rtrn;
  }
}
