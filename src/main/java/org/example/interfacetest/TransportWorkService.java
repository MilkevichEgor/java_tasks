package org.example.interfacetest;

public class TransportWork implements ITest {
	@Override
	public void start() {
		System.out.println("Transport started");
	}

  @Override
  public void stop() {
	System.out.println("Transport stopped");
  }
}
