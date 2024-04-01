package org.example.designpatterns;

interface DoorFactory {

	Door makeDoor();
	DoorFittingExpert makeFittingExpert();
}

class WoodenDoorFactory implements DoorFactory {

	@Override
	public Door makeDoor() {
		return new WoodenDoor();
	}

	@Override
	public DoorFittingExpert makeFittingExpert() {
		return new Carpenter();
	}
}

class IronDoorFactory implements DoorFactory {

	@Override
	public Door makeDoor() {
		return new IronDoor();
	}

	@Override
	public DoorFittingExpert makeFittingExpert() {
		return new Welder();
	}
}