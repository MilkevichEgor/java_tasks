package org.example.dataStructures;

public class Pet {
  private String name;
  private int age;
  private String type;

  public Pet(String name, int age, String type) {
	this.name = name;
	this.age = age;
	this.type = type;
  }

  public String getName() {
	return name;
  }

  public int getAge() {
	return age;
  }

  public String getType() {
	return type;
  }

  public String toString() {
	return name + " " + age + " " + type;
  }
}
