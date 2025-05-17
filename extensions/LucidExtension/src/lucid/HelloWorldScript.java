package lucid;

import ghidra.app.script.GhidraScript;

public class HelloWorldScript extends GhidraScript {
  @Override
  public void run() throws Exception {
    println("Hello from Lucidity Consulting!");
  }
}
