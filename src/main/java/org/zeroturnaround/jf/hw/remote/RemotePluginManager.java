package org.zeroturnaround.jf.hw.remote;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.zeroturnaround.jf.hw.Plugin;

public class RemotePluginManager {

  public static String[] findAllPlugins() {
    return findAllPluginInfos().keySet().toArray(new String[] {});
  }

  private static Map<String, String> findAllPluginInfos() {
    return new HashMap() {
      {
        put("NomNomNomPlugin", "https://raw.github.com/zeroturnaround/jf-hw-classloaders/master/plugins-remote/NomNomNomPlugin/README.properties");
        put("ChickenPlugin", "https://raw.github.com/zeroturnaround/jf-hw-classloaders/master/plugins-remote/ChickenPlugin/README.properties");
        put("HeadAndShouldersPlugin", "https://raw.github.com/zeroturnaround/jf-hw-classloaders/master/plugins-remote/HeadAndShouldersPlugin/README.properties");
      }
    };
  }

  public static Plugin getPluginInstance(String string) {
    // see the LocalPluginManager getPluginInstance(String str);
    // method and implement something similar.

    return null;
  }

  /*
   * Simple method to load remote property files.
   */
  public static Properties loadPropertiesFile(URL url) {
    Properties tmp = new Properties();
    try (InputStream is = url.openStream()) {
      tmp.load(is);
    }
    catch (IOException e) {
      throw new RuntimeException(e);
    }
    return tmp;
  }
}
