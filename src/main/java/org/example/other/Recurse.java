package org.example.other;

public class Recurse {

  public static void main(String[] args) {
    System.out.println(sum(5));
    System.out.println(fibonacci(6));
    System.out.println(factorial(5));
  }
    public static int sum(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + sum(n - 1);
        }
    }

    public static int fibonacci(int n) {
        int a = 0;
        int b = 1;
        int c;

        for (int i = 0; i < n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return a;
    }

    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
