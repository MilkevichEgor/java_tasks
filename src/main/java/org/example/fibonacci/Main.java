package org.example.fibonacci;

public class Main {

  static int count = 0;

  private static int fibonacci(int n) {
    int a = 0;
    int b = 1;
    int c;

    for(int i = 0; i < n; i++) {
      count++;
      c = a + b;
      a = b;
      b = c;
    }
    return a;
  }
  public static void main(String[] args) {
      count = 0;
      System.out.println("fibonacci(" + 50 + ") = " + fibonacci(50));
      System.out.println("count = " + count);
    }
}
