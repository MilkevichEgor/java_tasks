package org.example.designpatterns;

interface Door {
  void getDescription();
}

class WoodenDoor implements Door {
  public void getDescription() {
	System.out.println("Я деревянная дверь");
  }
}
class IronDoor implements Door
{
  public void getDescription() {
	System.out.println("Я железная дверь");
  }
}
