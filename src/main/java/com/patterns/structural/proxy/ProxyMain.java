package com.patterns.structural.proxy;

public class ProxyMain {
  public static void main(String[] args) {
    CommandExecutor commandExecutorProxy = new CommandExecutorProxy("bobby", "pass");
    try {
      commandExecutorProxy.runCommand("ls -lah");
      commandExecutorProxy.runCommand(" rm -rf somefile.pdf");
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}
