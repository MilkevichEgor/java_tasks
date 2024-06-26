package org.example.interview.lambdafunction;

public class LambdaApp2 {

  public static void main(String[] args) {

	Expression func = n -> n % 2 == 0; // выражение, которое проверяет, является ли число четным
	int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
	System.out.println(sum(nums, func)); // 20

	int x = sum(nums, (n)-> n > 5); // сумма чисел, которые больше 5
	System.out.println(x);  // 30
  }
  private static int sum (int[] numbers, Expression func)
  {
	int result = 0;
	for(int i : numbers) {
	  if (func.isEqual(i))
		result += i;
	}
	return result;
  }
}

interface Expression{
  boolean isEqual(int n);
}
