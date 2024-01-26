package org.example.interview.oop.service;

public interface CarService {
   	void start();

 	default void stop() {
 		System.out.println("Car stopped");
 	}
}