package org.example.interfacetest;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
//	  Car car = new Car("Tesla", "Model S", "Blue");
//	  car.changeColor();
	  final List<String> strings = new ArrayList<>();
	  System.out.println(strings.size());
	  strings.add("baeldung");
	  System.out.println(strings.size());
	  System.out.println(strings);
	}
}
