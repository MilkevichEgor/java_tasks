package org.example.interview.thread;

import java.util.concurrent.Exchanger;

public class MyThread implements Runnable {

  Exchanger<String> ex;
  String message;

  public MyThread(Exchanger<String> ex) {
	  this.ex = ex;
  }

  @Override
  public void run() {
	try {
	  message = ex.exchange("Put Message");
	  System.out.println("GetThread has received: " + message);
	} catch (InterruptedException e){
	  System.out.println(e.getMessage());
	}
  }
}
