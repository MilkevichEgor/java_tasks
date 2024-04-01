package org.example.interview.thread;

import java.util.concurrent.Exchanger;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicInteger;

public class CountThread implements Runnable {
  AtomicInteger x;
  Semaphore semaphore;
  Exchanger<String> ex = new Exchanger<>();
  String message;

  public CountThread(AtomicInteger x, Semaphore semaphore) {
	this.x = x;
	this.semaphore = semaphore;
  }

  @Override
  public void run() {

	try {
	  System.out.println(Thread.currentThread().getName() + " ожидает разрешение");
	  semaphore.acquire();
	  x.set(1);

	  for (int i = 1; i < 5; i++) {
		System.out.println(Thread.currentThread().getName() + ": " + x.get());
		  x.incrementAndGet();
//			j++;
		  Thread.sleep(100);
	  }
	} catch (InterruptedException e){System.out.println(e.getMessage());} {
	  System.out.println(Thread.currentThread().getName() + " освобождает разрешение");
	  semaphore.release();
	}
  }
}
