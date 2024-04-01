package org.example.interfacetest;

public interface ITest {

  void start();

  void stop();

  default void changeColor() {
    System.out.println("Car color changed");
  }
}
