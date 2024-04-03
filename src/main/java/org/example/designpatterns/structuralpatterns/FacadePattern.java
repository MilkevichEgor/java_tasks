package org.example.designpatterns.structuralpatterns;

public class FacadePattern {
  public static void main(String[] args) {

	SmartHomeFacade smartHome = new SmartHomeFacade();

	smartHome.startEveningMode();
	System.out.println("Evening Mode Started");

	smartHome.endEveningMode();
	System.out.println("Evening Mode Ended");
  }
}

class AudioSystem {

  public void turnOn() {
	System.out.println("Audio System is turned on");
  }

  public void turnOff() {
	System.out.println("Audio System is turned off");
  }
}

class LightSystem {

  public void dim() {
	System.out.println("Light System is dimmed");
  }

  public void bright() {
	System.out.println("Light System is bright");
  }
}

class SmartHomeFacade {

  private AudioSystem audioSystem;
  private LightSystem lightSystem;

  public SmartHomeFacade() {
	audioSystem = new AudioSystem();
	lightSystem = new LightSystem();
  }

  public void startEveningMode() {
	  audioSystem.turnOn();
	  lightSystem.dim();
  }

  public void endEveningMode() {
	  audioSystem.turnOff();
	  lightSystem.bright();
  }
}
