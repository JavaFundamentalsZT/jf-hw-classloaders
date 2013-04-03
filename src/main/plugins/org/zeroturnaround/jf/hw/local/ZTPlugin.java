package org.zeroturnaround.jf.hw.local;

import org.zeroturnaround.jf.hw.Plugin;

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
