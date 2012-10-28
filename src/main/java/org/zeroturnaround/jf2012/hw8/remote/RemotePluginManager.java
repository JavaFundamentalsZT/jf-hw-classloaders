package org.zeroturnaround.jf2012.hw8.remote;

import java.util.HashMap;
import java.util.Map;

import org.zeroturnaround.jf2012.hw8.Plugin;

public class RemotePluginManager {

  public static String[] findAllPlugins() {
    return findAllPluginInfos().keySet().toArray(new String[] {});
  }

  private static Map<String, String> findAllPluginInfos() {
    return new HashMap() {
      {
        put("NomNomNomPlugin", "org.zeroturnaround.jf2012.hw8.remote.NomNomNomPlugin");
        put("ChickenPlugin", "org.zeroturnaround.jf2012.hw8.remote.ChickenPlugin");
        put("HeadAndShouldersPlugin", "org.zeroturnaround.jf2012.hw8.remote.HeadAndShouldersPlugin");
      }
    };
  }

  public static Plugin getPluginInstance(String string) {
    return null;
  }
}
