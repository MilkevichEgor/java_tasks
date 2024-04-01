package org.example.designpatterns;

  interface DoorFittingExpert {
	void getDescription();
  }

  class Welder implements DoorFittingExpert {
	public void getDescription() {
	  System.out.println("Я работаю только с железными дверьми");
	}
  }

  class Carpenter implements DoorFittingExpert
  {
	public void getDescription() {
	  System.out.println("Я работаю только с деревянными дверьми");
	}
  }
