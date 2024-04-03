package org.example.designpatterns.generativepatterns;

public class SimpleFactoryPattern {

  public static void main(String[] args) {

	Door door = DoorFactory.createDoor(100, 200);
	System.out.println("Width: " + door.getWidth() + " Height: " + door.getHeight());

  }
}

interface Door {
  float getWidth();
  float getHeight();

}

class WoodenDoor implements Door {

  private float width;
  private float height;

  public WoodenDoor(float width, float height) {
	this.width = width;
	this.height = height;
  }

  @Override
  public float getWidth() {
	return width;
  }

  @Override
  public float getHeight() {
	return height;
  }
}

class DoorFactory {

  public static Door createDoor(float width, float height) {
	return new WoodenDoor(width, height);
  }
}
