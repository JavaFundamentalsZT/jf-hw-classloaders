package org.zeroturnaround.jf.hw;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.zeroturnaround.jf.hw.local.LocalPluginManager;

public class LocalPluginManagerTests {
  @Test
  public void testFindAllPlugins() {
    String[] all = LocalPluginManager.findAllPlugins();
    assertEquals("GithubPlugin", all[0]);
    assertEquals("ZTPlugin", all[1]);
    assertEquals(2, all.length);
  }

  @Test
  public void testGetInstance() {
    Plugin plugin = LocalPluginManager.getPluginInstance("ZTPlugin");
    assertEquals("ZeroTurnaround", plugin.getName());
  }

  @Test(expected=NullPointerException.class)
  public void testGetInstanceOfNonExistingPlugin() {
    Plugin plugin = LocalPluginManager.getPluginInstance("TTU");
  }
}
