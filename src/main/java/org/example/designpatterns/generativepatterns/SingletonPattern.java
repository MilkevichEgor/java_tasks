package org.example.designpatterns.generativepatterns;

public class  SingletonPattern {
  public static void main(String[] args) {

	President president = President.getInstance();
	president.doSomething();
  }
}

final class President {
  private static President instance;

  private President() {}
  public static President getInstance() {
	if (instance == null) {
		instance = new President();
	}
	return instance;
  }

  public void doSomething() {
	System.out.println("Doing something...");
  }
}
