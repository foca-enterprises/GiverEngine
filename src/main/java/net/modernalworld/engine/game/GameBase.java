package net.modernalworld.engine.game;

import net.modernalworld.engine.Engine;
import net.modernalworld.engine.gui.Window;

public abstract class GameBase {
  private final String name;
  private Window window;
  private boolean hideConsole;
  private int updates;
  private int fps;
  
  public GameBase(String name) {
    this(name, true);
  }
  
  public GameBase(String name, boolean hideConsole) {
    this(name, hideConsole, 60);
  }
  
  public GameBase(String name, boolean hideConsole, int updates) {
    this(name, hideConsole, updates, updates);
  }
  
  public GameBase(String name, boolean hideConsole, int updates, int fps) {
    this.name = name;
    this.hideConsole = hideConsole;
    this.updates = updates;
    this.fps = fps;
  }
  
  public String getName() {
    return name;
  }
  
  public void setHideConsole(boolean hideConsole) {
    this.hideConsole = hideConsole;
  }
  
  public boolean isHideConsole() {
    return this.hideConsole;
  }
  
  public int getMaxUpdates() {
    return this.updates;
  }
  
  public int getMaxFPS() {
    return fps;
  }
  
  public void setWindow(Window window) {
    this.window = window;
  }
  
  public Window getWindow() {
    return window;
  }
  
  public abstract void onEnable();
  
  public abstract void onDisable();
  
  public abstract void update();
  
  public abstract void render();
}
