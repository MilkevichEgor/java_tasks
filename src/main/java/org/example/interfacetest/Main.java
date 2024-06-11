package org.example.interfacetest;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		CarService carService = new CarService(new TransportWorkService());
		carService.start();
		carService.stop();
	}
}
