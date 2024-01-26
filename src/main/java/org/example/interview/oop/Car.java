package org.example.interview.oop;

import org.example.interview.oop.service.CarService;
import org.example.interview.oop.service.MyInterfaceJDK9;

public abstract class Car implements CarService, MyInterfaceJDK9 {

   private String name;
   private String model;
   private String color;

   public Car(String name, String model, String color) {
	 this.name = name;
	 this.model = model;
	 this.color = color;
   }

   public String getName() {
	 return name;
   }


   private void setName(String name) {
	 this.name = name;
   }

   public String toString() {
	 return "Car: " + name + " " + model + " " + color;
   }

  @Override
  public void start() {
	 System.out.println("Car started");
  }
}

class PassengerCar extends Car {
   public PassengerCar(String name, String model, String color) {
	 super(name, model, color);
   }

   @Override
   public void start() {
	 System.out.println("Passenger car started");
   }

  @Override
  public void nonDefaultMethod() {
	 System.out.println("Passenger car non default method");
  }
}
