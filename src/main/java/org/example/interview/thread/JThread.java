package org.example.interview.thread;

import java.util.List;
import java.util.concurrent.Exchanger;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class JThread implements Runnable{
  Exchanger<String> ex = new Exchanger<>();
  String message;

  public JThread(Exchanger<String> ex) {
	  this.ex = ex;
  }

  @Override
  public void run() {

	try {
	  message = ex.exchange("Get Message");
	  System.out.println("GetThread has received: " + message);
	} catch (InterruptedException e){
	  System.out.println(e.getMessage());
	}
  }
}

