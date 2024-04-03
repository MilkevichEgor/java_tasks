package org.example.designpatterns.behavioralpatterns;

public class CommandPattern {
  public static void main(String[] args) {

	Bilboat bilboat = new Bilboat();
	TurnOn turnOn = new TurnOn(bilboat);
	TurnOff turnOff = new TurnOff(bilboat);

	RemoteControl remote = new RemoteControl();
	remote.submit(turnOn);
	remote.submit(turnOff);

  }
}

class Bilboat {

  public void turnOn() {
	System.out.println("Лампочка включена");
  }

  public void turnOff() {
	System.out.println("Лампочка выключена");
  }
}

interface Command {
  void execute();
  void undo();
  void redo();
}

class TurnOn implements Command {
  private Bilboat bilboat;

  public TurnOn(Bilboat bilboat) {
	this.bilboat = bilboat;
  }

  @Override
  public void execute() {
	bilboat.turnOn();
  }

  @Override
  public void undo() {
	bilboat.turnOff();
  }

  @Override
  public void redo() {
	this.execute();
  }
}

class TurnOff implements Command {
  private Bilboat bilboat;

  public TurnOff(Bilboat bilboat) {
	this.bilboat = bilboat;
  }

  @Override
  public void execute() {
	bilboat.turnOff();
  }

  @Override
  public void undo() {
	bilboat.turnOn();
  }

  @Override
  public void redo() {
	this.execute();
  }
}

class RemoteControl {

  public void submit(Command command) {
	command.execute();
  }
}