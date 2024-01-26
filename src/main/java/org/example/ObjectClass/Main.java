package org.example.ObjectClass;


import java.util.Objects;

public class Main {
  
  public static void main(String[] args) {

    Car car = new Car("Tesla", "Model S", "Red");
    Car car1 = new Car("Tesla", "Model S", "Green");
    Car car2 = new Car("BMW", "X5", "Blue");
    System.out.println(car);
    System.out.println(car.hashCode());
    System.out.println(car.equals(car1));
	
  }

  static class Car {

    private String name;
    private String model;
    private String color;

    public Car(String name, String model, String color) {
      this.name = name;
      this.model = model;
      this.color = color;
    }

    @Override
    public String toString() {
      return "Car: " + name + " " + model + " " + color;
    }

    @Override
    public int hashCode() {
      return Objects.hash(name, model, color);
    }

    @Override
    public boolean equals(Object obj) {
      if(!(obj instanceof Car)) {
        return false;
      }
      Car car = (Car) obj;
      return name.equals(car.name) && model.equals(car.model);
    }
  }
}
