package org.example.designpatterns.behavioralpatterns;

import java.util.ArrayList;
import java.util.List;

// Интерфейс для оповещения наблюдателей об изменениях
interface Subject {
  void registerObserver(Observer observer);
  void removeObserver(Observer observer);
  void notifyObservers();
}

// Интерфейс для наблюдателей
interface Observer {
  void update(String message);
}

// Конкретная реализация субъекта
class ConcreteSubject implements Subject {
  private List<Observer> observers = new ArrayList<>();
  private String message;

  @Override
  public void registerObserver(Observer observer) {
	observers.add(observer);
  }

  @Override
  public void removeObserver(Observer observer) {
	observers.remove(observer);
  }

  @Override
  public void notifyObservers() {
	for (Observer observer : observers) {
	  observer.update(message);
	}
  }

  public void setMessage(String message) {
	this.message = message;
	notifyObservers();
  }
}

// Конкретная реализация наблюдателя
class ConcreteObserver implements Observer {
  private String name;

  public ConcreteObserver(String name) {
	this.name = name;
  }

  @Override
  public void update(String message) {
	System.out.println(name + " получил сообщение: " + message);
  }
}

// Используем шаблон "Наблюдатель"
class Main {
  public static void main(String[] args) {
	ConcreteSubject subject = new ConcreteSubject();

	ConcreteObserver observer1 = new ConcreteObserver("Наблюдатель 1");
	ConcreteObserver observer2 = new ConcreteObserver("Наблюдатель 2");

	subject.registerObserver(observer1);
	subject.registerObserver(observer2);

	subject.setMessage("Сообщение для всех наблюдателей");
  }
}