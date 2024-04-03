package org.example.designpatterns.generativepatterns;

public class BuilderPattern {

  public static void main(String[] args) {

	BurgerBuilder builder = new BurgerBuilder(100);
	builder.addCheese();
	builder.addPepperoni();
	builder.addLettuce();
	builder.addTomato();
	builder.build();

	System.out.println(builder);
  }
}

class Burger {
  protected int size;
  protected boolean cheese;
  protected boolean pepperoni;
  protected boolean lettuce;
  protected boolean tomato;

  public Burger(BurgerBuilder builder) {
	this.size = builder.size;
	this.cheese = builder.cheese;
	this.pepperoni = builder.pepperoni;
	this.lettuce = builder.lettuce;
	this.tomato = builder.tomato;
  }

  public String toString() {
	return "Size: " + size +
			", Cheese: " + cheese +
			", Pepperoni: " + pepperoni +
			", Lettuce: " + lettuce +
			", Tomato: " + tomato;
  }
}

class BurgerBuilder {
  protected int size;
  protected boolean cheese;
  protected boolean pepperoni;
  protected boolean lettuce;
  protected boolean tomato;

  public BurgerBuilder(int size) {
	this.size = size;
  }

  public BurgerBuilder addCheese() {
	this.cheese = true;
	return this;
  }

  public BurgerBuilder addPepperoni() {
	this.pepperoni = true;
	return this;
  }

  public BurgerBuilder addLettuce() {
	this.lettuce = true;
	return this;
  }

  public BurgerBuilder addTomato() {
	this.tomato = true;
	return this;
  }

  public Burger build() {
	return new Burger(this);
  }

  public String toString() {
	return "Burger: " + build();
  }
}
