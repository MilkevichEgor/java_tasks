package org.example.interfacetest;

public class CarService {

	private TransportWorkService transportWorkService;

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
