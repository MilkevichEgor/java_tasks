package org.example.interfacetest;

public class CarService {

	private ITest transportWorkService;

	public CarService(TransportWorkService transportWorkService) {
		this.transportWorkService = transportWorkService;
	}

	public void start() {
		transportWorkService.start();
		Car car = new Car("Tesla", "Model S", "Red");
	}

	public void stop() {
		transportWorkService.stop();
	}
}
