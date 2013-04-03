package org.zeroturnaround.jf.hw.remote;

import org.zeroturnaround.jf.hw.Plugin;

public class NomNomNomPlugin implements Plugin {

  @Override
  public String getName() {
    return "NomNomNom";
  }

  @Override
  public String getURL() {
    return "http://icanhas.cheezburger.com/";
  }

  @Override
  public byte[] getLogo() {
    return null;
  }

  public String toString() {
    return getName()+" @ "+getURL();
  }
}
