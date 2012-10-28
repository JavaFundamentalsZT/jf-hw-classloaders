package org.zeroturnaround.jf2012.hw7.local;

import org.zeroturnaround.jf2012.hw7.Plugin;

public class ZTPlugin implements Plugin {

  @Override
  public String getName() {
    return "ZeroTurnaround";
  }

  @Override
  public String getURL() {
    return "http://www.zeroturnaround.com/";
  }

  @Override
  public byte[] getLogo() {
    return null;
  }
  
  public String toString() {
    return getName()+" @ "+getURL();
  }
}
