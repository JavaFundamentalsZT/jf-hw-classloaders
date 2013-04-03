package org.zeroturnaround.jf.hw.remote;

import java.util.HashMap;
import java.util.Map;

import org.zeroturnaround.jf.hw.Plugin;

public class RemotePluginManager {

  public static String[] findAllPlugins() {
    return findAllPluginInfos().keySet().toArray(new String[] {});
  }

  private static Map<String, String> findAllPluginInfos() {
    return new HashMap() {
      {
        put("NomNomNomPlugin", "https://raw.github.com/zeroturnaround/jf-2012-hw8/master/plugins-remote/NomNomNomPlugin/README.properties");
        put("ChickenPlugin", "https://raw.github.com/zeroturnaround/jf-2012-hw8/master/plugins-remote/ChickenPlugin/README.properties");
        put("HeadAndShouldersPlugin", "https://raw.github.com/zeroturnaround/jf-2012-hw8/master/plugins-remote/HeadAndShouldersPlugin/README.properties");
      }
    };
  }

  public static Plugin getPluginInstance(String string) {
    return null;
  }
}
