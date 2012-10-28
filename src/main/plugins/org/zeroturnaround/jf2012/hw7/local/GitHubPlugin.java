package org.zeroturnaround.jf2012.hw7.local;

import org.zeroturnaround.jf2012.hw7.Plugin;

public class GitHubPlugin implements Plugin {

  @Override
  public String getName() {
    return "GitHub";
  }

  @Override
  public String getURL() {
    return "http://www.github.com/";
  }

  @Override
  public byte[] getLogo() {
    return null;
  }
  
  public String toString() {
    return getName()+" @ "+getURL();
  }
}
