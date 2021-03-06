package com.sntoolkit.scom;

import com.service_now.mid.probe.JavascriptProbe;

public abstract interface IProcessor
{
  public abstract Boolean process();
  
  public abstract Boolean sendComplete();
  
  public JavascriptProbe get_probe();
  
  public void sendResult(String name, String output);
}
