package org.example.interview.lambdafunction;

public class LambdaApp {

  static int x = 20;
  static int y = 30;

  public static void main(String[] args) {

    int a = 10;
    int b = 20;

    Printable printable = System.out::println;
    printable.print("Hello World");


    Operationable op = () -> {
      return a + b;
    };

    System.out.println(op.calculate());
    System.out.println(x);

  }
  interface Operationable{
    int calculate();

  }

  interface Printable{
    void print(String s);
  }
}

