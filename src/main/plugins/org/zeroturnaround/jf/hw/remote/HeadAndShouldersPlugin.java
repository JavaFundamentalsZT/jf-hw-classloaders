package org.zeroturnaround.jf.hw.remote;

import org.zeroturnaround.jf.hw.Plugin;

public class HeadAndShouldersPlugin implements Plugin {

  @Override
  public String getName() {
    return "HeadAndShoulders";
  }

  @Override
  public String getURL() {
    return "http://en.wikipedia.org/wiki/Head_%26_Shoulders";
  }

  @Override
  public byte[] getLogo() {
    return null;
  }

  public String toString() {
    return getName() + " @ " + getURL();
  }
}
