package org.zeroturnaround.jf.hw;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.zeroturnaround.jf.hw.local.LocalPluginLoader;

public class LocalPluginLoaderTests {
  @Test
  public void testLoadingExistingClass() throws Exception {
    LocalPluginLoader lpl = new LocalPluginLoader("GithubPlugin");
    Class clazz = lpl.loadClass("org.zeroturnaround.jf.hw.local.GitHubPlugin");
    Plugin plugin = (Plugin) clazz.newInstance();
    assertEquals("GitHub", plugin.getName());
  }

  @Test(expected = ClassNotFoundException.class)
  public void testLoadingNonExistingClass() throws Exception {
    LocalPluginLoader lpl = new LocalPluginLoader("GithubPlugin");

    Class clazz = lpl.loadClass("org.zeroturnaround.jf.hw.local.GitHubPluginTwo");
  }
}
