package org.zeroturnaround.jf.hw;

import static org.junit.Assert.assertEquals;

import java.net.URL;
import java.util.Properties;

import org.junit.Assert;
import org.junit.Test;
import org.zeroturnaround.jf.hw.remote.RemotePluginManager;

public class RemotePluginManagerTests {

  @Test
  public void loadRemotePlugins() {
    String[] allPluginNames = RemotePluginManager.findAllPlugins();

    for (int i = 0; i < allPluginNames.length; i++) {
      Plugin plugin = RemotePluginManager.getPluginInstance(allPluginNames[i]);
      Assert.assertNotEquals(null, plugin);
    }
  }

  @Test
  public void testRemotePropertiesLoading() throws Exception {
    URL url = new URL("https://raw.github.com/zeroturnaround/jf-hw-classloaders/master/plugins-remote/NomNomNomPlugin/README.properties");
    Properties props = RemotePluginManager.loadPropertiesFile(url);
    assertEquals(3, props.keySet().size());
    assertEquals("NomNomNomPlugin", props.get("name"));
  }
}
