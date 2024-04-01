package org.example.interfacetest;

public class Car implements ITest {
	private String name;
	private String model;
	private String color;

	public Car(String name, String model, String color) {
		this.name = name;
		this.model = model;
		this.color = color;
	}


  @Override
  public void start() {
	  System.out.println("Car started");
  }

  @Override
  public void stop() {
	  System.out.println("Car stopped");
  }

}
