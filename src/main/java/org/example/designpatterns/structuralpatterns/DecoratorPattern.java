package org.example.designpatterns.structuralpatterns;

public class DecoratorPattern {
  public static void main(String[] args) {

	Coffee simpleCoffee = new SimpleCoffee();
	System.out.println(simpleCoffee.getCost());
	System.out.println(simpleCoffee.getDescription());

	Coffee milkCoffee = new MilkCoffee();
	System.out.println(milkCoffee.getCost());
	System.out.println(milkCoffee.getDescription());

	Coffee vanillaCoffee = new VanillaCoffee();
	System.out.println(vanillaCoffee.getCost());
	System.out.println(vanillaCoffee.getDescription());
  }
}

interface Coffee {
  int getCost();
  String getDescription();
}

class SimpleCoffee implements Coffee {

  @Override
  public int getCost() {
	return 10;
  }

  @Override
  public String getDescription() {
	return "Simple Coffee";
  }
}

class MilkCoffee implements Coffee {

  private Coffee coffee;

  public MilkCoffee() {
	coffee = new SimpleCoffee();
  }

  @Override
  public int getCost() {
	return coffee.getCost() + 5;
  }

  @Override
  public String getDescription() {
	return coffee.getDescription() + " with milk";
  }
}

class VanillaCoffee implements Coffee {

  private Coffee coffee;

  public VanillaCoffee() {
	coffee = new SimpleCoffee();
  }
  @Override
  public int getCost() {
	return coffee.getCost() + 7;
  }

  @Override
  public String getDescription() {
	return coffee.getDescription() + " with vanilla";
  }
}