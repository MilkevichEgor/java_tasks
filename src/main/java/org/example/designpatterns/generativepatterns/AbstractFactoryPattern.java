package org.example.designpatterns.generativepatterns;

public class AbstractFactoryPattern {

  public static void main(String[] args) {

	WoodenDoorFactory woodenDoorFactory = new WoodenDoorFactory();
	WoodenDoorAbstract woodenDoor = woodenDoorFactory.makeDoor();
	woodenDoor.getDescription();

	IronDoorFactory ironDoorFactory = new IronDoorFactory();
	IronDoorAbstract ironDoor = ironDoorFactory.makeDoor();
	ironDoor.getDescription();
  }
}

interface DoorInAbstractFactory {
  void getDescription();
}

interface DoorFittingExpert {

  void getDescription();
}

interface DoorFactoryAbstractFactory {
  DoorInAbstractFactory makeDoor();
  DoorFittingExpert makeDoorFittingExpert();
}

class WoodenDoorAbstract implements DoorInAbstractFactory {

  @Override
  public void getDescription() {
	System.out.println("Wooden door");
  }
}

class IronDoorAbstract implements DoorInAbstractFactory {

  @Override
  public void getDescription() {
	System.out.println("Iron door");
  }
}

class Welder implements DoorFittingExpert {

  @Override
  public void getDescription() {
	System.out.println("Welder Experts");
  }
}

class Carpenter implements DoorFittingExpert {

  @Override
  public void getDescription() {
	System.out.println("Carpenter Experts");
  }
}

class WoodenDoorFactory implements DoorFactoryAbstractFactory {

  @Override
  public WoodenDoorAbstract makeDoor() {
	return new WoodenDoorAbstract();
  }

  @Override
  public DoorFittingExpert makeDoorFittingExpert() {
	return new Carpenter();
  }
}

class IronDoorFactory implements DoorFactoryAbstractFactory {
  @Override
  public IronDoorAbstract makeDoor() {
	return new IronDoorAbstract();
  }

  @Override
  public DoorFittingExpert makeDoorFittingExpert() {
	return new Welder();
  }
}

