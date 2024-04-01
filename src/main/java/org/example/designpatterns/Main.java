package org.example.designpatterns;

public class Main {

  public static void main(String[] args) {
	DoorFactory doorFactory = new WoodenDoorFactory();
	Door door = doorFactory.makeDoor();
	DoorFittingExpert expert = doorFactory.makeFittingExpert();

	door.getDescription();
	expert.getDescription();
  }
}
