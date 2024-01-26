package org.example.interview.oop;

import org.example.interview.oop.service.MyInterface;

public class Main {

	public static void main(String[] args) {

	  PassengerCar passengerCar = new PassengerCar("Tesla", "Model S", "Red");
//	  passengerCar.start();
//	  passengerCar.stop();
	  passengerCar.nonDefaultMethod();
	  passengerCar.defaultMethod1();
	  passengerCar.defaultMethod2();

	  MyInterface triple = x -> x * 3;
	  int result = triple.apply(5);
	  System.out.println(result);

	}
}
