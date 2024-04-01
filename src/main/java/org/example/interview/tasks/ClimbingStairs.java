package org.example.interview.tasks;

public class ClimbingStairs {

  public static void main(String[] args) {

	int n1 = 3;
	int n2 = 6;

	ClimbingStairs climbingStairs = new ClimbingStairs();
	System.out.println(climbingStairs.climbStairs(n2));

  }

  public int climbStairs(int n) {

	int a = 1;
	int b = 1;
	int c;

	if (n == 1 || n == 2) {
	  return 1;
	}

	for (int i = 2; i <= n; i++) {
	  c = a + b;
	  a = b;
	  b = c;
	}
	return b;
  }
}
