package org.zeroturnaround.jf.hw.remote;

import org.zeroturnaround.jf.hw.Plugin;

public class ChickenPlugin implements Plugin {

  @Override
  public String getName() {
    return "Chicken";
  }

  @Override
  public String getURL() {
    return "http://en.wikipedia.org/wiki/Chicken";
  }

  @Override
  public byte[] getLogo() {
    return null;
  }

  public String toString() {
    return getName() + " @ " + getURL();
  }
}
