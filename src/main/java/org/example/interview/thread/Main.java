package org.example.interview.thread;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;
import org.example.dataStructures.Person;

public class Main {

  public static void main(String[] args) throws InterruptedException {
//    AtomicIntegerArray arr = new AtomicIntegerArray(10);

//    Exchanger<String> ex = new Exchanger<>();
//    new Thread(new MyThread(ex)).start();
//    new Thread(new JThread(ex)).start();
//
//    ReentrantLock lock = new ReentrantLock();
//    AtomicReference<Person> ref = new AtomicReference<>();
    Semaphore sem = new Semaphore(1);
    CountThread ct = new CountThread(new AtomicInteger(1), sem);

    for (int i = 1; i < 4; i++) {
      new Thread(ct).start();
    }
    // Create a fixed-size thread pool with 3 threads

    // Submit tasks to the thread pool
//    for (int i = 1; i <= 5; i++) { int taskId = i; executor.submit(() -> {
//      System.out.println("Task " + taskId + " executed by " + Thread.currentThread().getName());
//    });
//    }
    // Shutdown the executor after all tasks are submitted
//    executor.shutdown();

  }
}
